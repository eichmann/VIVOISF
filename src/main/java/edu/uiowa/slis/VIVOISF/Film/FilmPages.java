package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmPages currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmPagesIterator theFilm = (FilmPagesIterator)findAncestorWithClass(this, FilmPagesIterator.class);
			pageContext.getOut().print(theFilm.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for pages tag ");
		}
		return SKIP_BODY;
	}
}

