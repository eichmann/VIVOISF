package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmEanucc13Iterator theFilm = (FilmEanucc13Iterator)findAncestorWithClass(this, FilmEanucc13Iterator.class);
			pageContext.getOut().print(theFilm.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

