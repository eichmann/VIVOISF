package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmPmidIterator theFilm = (FilmPmidIterator)findAncestorWithClass(this, FilmPmidIterator.class);
			pageContext.getOut().print(theFilm.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for pmid tag ");
		}
		return SKIP_BODY;
	}
}

