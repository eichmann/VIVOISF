package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmContent currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmContentIterator theFilm = (FilmContentIterator)findAncestorWithClass(this, FilmContentIterator.class);
			pageContext.getOut().print(theFilm.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for content tag ");
		}
		return SKIP_BODY;
	}
}

