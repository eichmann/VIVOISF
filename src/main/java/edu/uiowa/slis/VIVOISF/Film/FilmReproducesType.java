package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmReproducesIterator theFilmReproducesIterator = (FilmReproducesIterator)findAncestorWithClass(this, FilmReproducesIterator.class);
			pageContext.getOut().print(theFilmReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

