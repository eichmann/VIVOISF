package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmPageStartIterator theFilm = (FilmPageStartIterator)findAncestorWithClass(this, FilmPageStartIterator.class);
			pageContext.getOut().print(theFilm.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

