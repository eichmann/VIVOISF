package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmUri currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmUriIterator theFilm = (FilmUriIterator)findAncestorWithClass(this, FilmUriIterator.class);
			pageContext.getOut().print(theFilm.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for uri tag ");
		}
		return SKIP_BODY;
	}
}

