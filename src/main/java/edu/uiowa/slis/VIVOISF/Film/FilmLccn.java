package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmLccnIterator theFilm = (FilmLccnIterator)findAncestorWithClass(this, FilmLccnIterator.class);
			pageContext.getOut().print(theFilm.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for lccn tag ");
		}
		return SKIP_BODY;
	}
}

