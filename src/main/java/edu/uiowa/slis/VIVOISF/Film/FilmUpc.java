package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmUpcIterator theFilm = (FilmUpcIterator)findAncestorWithClass(this, FilmUpcIterator.class);
			pageContext.getOut().print(theFilm.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for upc tag ");
		}
		return SKIP_BODY;
	}
}

