package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmRelatedByIterator theFilmRelatedByIterator = (FilmRelatedByIterator)findAncestorWithClass(this, FilmRelatedByIterator.class);
			pageContext.getOut().print(theFilmRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

