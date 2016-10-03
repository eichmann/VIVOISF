package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmCodenIterator theFilm = (FilmCodenIterator)findAncestorWithClass(this, FilmCodenIterator.class);
			pageContext.getOut().print(theFilm.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for coden tag ");
		}
		return SKIP_BODY;
	}
}

