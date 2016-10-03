package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmShortDescriptionIterator theFilm = (FilmShortDescriptionIterator)findAncestorWithClass(this, FilmShortDescriptionIterator.class);
			pageContext.getOut().print(theFilm.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

