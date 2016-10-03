package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmGtin14Iterator theFilm = (FilmGtin14Iterator)findAncestorWithClass(this, FilmGtin14Iterator.class);
			pageContext.getOut().print(theFilm.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

