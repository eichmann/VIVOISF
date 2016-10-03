package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmLocatorIterator theFilm = (FilmLocatorIterator)findAncestorWithClass(this, FilmLocatorIterator.class);
			pageContext.getOut().print(theFilm.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for locator tag ");
		}
		return SKIP_BODY;
	}
}

