package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmStatusIterator theFilmStatusIterator = (FilmStatusIterator)findAncestorWithClass(this, FilmStatusIterator.class);
			pageContext.getOut().print(theFilmStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for status tag ");
		}
		return SKIP_BODY;
	}
}

