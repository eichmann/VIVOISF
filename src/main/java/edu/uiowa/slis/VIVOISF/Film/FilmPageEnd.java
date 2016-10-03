package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmPageEndIterator theFilm = (FilmPageEndIterator)findAncestorWithClass(this, FilmPageEndIterator.class);
			pageContext.getOut().print(theFilm.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

