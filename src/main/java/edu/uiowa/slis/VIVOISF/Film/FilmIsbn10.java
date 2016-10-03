package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmIsbn10Iterator theFilm = (FilmIsbn10Iterator)findAncestorWithClass(this, FilmIsbn10Iterator.class);
			pageContext.getOut().print(theFilm.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

