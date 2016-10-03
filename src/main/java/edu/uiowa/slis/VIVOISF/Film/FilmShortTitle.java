package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmShortTitleIterator theFilm = (FilmShortTitleIterator)findAncestorWithClass(this, FilmShortTitleIterator.class);
			pageContext.getOut().print(theFilm.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

