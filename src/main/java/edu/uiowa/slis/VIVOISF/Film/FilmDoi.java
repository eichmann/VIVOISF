package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmDoiIterator theFilm = (FilmDoiIterator)findAncestorWithClass(this, FilmDoiIterator.class);
			pageContext.getOut().print(theFilm.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for doi tag ");
		}
		return SKIP_BODY;
	}
}

