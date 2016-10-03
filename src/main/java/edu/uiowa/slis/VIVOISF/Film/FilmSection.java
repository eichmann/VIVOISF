package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmSection currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmSectionIterator theFilm = (FilmSectionIterator)findAncestorWithClass(this, FilmSectionIterator.class);
			pageContext.getOut().print(theFilm.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for section tag ");
		}
		return SKIP_BODY;
	}
}

