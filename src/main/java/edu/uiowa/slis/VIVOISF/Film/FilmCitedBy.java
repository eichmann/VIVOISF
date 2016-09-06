package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmCitedByIterator theFilmCitedByIterator = (FilmCitedByIterator)findAncestorWithClass(this, FilmCitedByIterator.class);
			pageContext.getOut().print(theFilmCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

