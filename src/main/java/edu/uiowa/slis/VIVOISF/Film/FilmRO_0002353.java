package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmRO_0002353.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmRO_0002353Iterator theFilm = (FilmRO_0002353Iterator)findAncestorWithClass(this, FilmRO_0002353Iterator.class);
			pageContext.getOut().print(theFilm.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

