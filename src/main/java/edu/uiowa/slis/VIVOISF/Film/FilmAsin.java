package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmAsinIterator theFilm = (FilmAsinIterator)findAncestorWithClass(this, FilmAsinIterator.class);
			pageContext.getOut().print(theFilm.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for asin tag ");
		}
		return SKIP_BODY;
	}
}

