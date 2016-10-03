package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmNumPagesIterator theFilm = (FilmNumPagesIterator)findAncestorWithClass(this, FilmNumPagesIterator.class);
			pageContext.getOut().print(theFilm.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for numPages tag ");
		}
		return SKIP_BODY;
	}
}

