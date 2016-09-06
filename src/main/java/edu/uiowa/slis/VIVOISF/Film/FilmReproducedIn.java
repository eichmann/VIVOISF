package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmReproducedInIterator theFilmReproducedInIterator = (FilmReproducedInIterator)findAncestorWithClass(this, FilmReproducedInIterator.class);
			pageContext.getOut().print(theFilmReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

