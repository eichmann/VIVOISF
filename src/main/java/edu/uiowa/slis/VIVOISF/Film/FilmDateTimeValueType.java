package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmDateTimeValueIterator theFilmDateTimeValueIterator = (FilmDateTimeValueIterator)findAncestorWithClass(this, FilmDateTimeValueIterator.class);
			pageContext.getOut().print(theFilmDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

