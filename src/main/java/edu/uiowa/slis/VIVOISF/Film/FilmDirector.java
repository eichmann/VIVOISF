package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmDirector extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmDirector currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmDirector.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmDirectorIterator theFilmDirectorIterator = (FilmDirectorIterator)findAncestorWithClass(this, FilmDirectorIterator.class);
			pageContext.getOut().print(theFilmDirectorIterator.getDirector());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for director tag ");
		}
		return SKIP_BODY;
	}
}

