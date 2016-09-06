package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmRO_0000056Iterator theFilmRO_0000056Iterator = (FilmRO_0000056Iterator)findAncestorWithClass(this, FilmRO_0000056Iterator.class);
			pageContext.getOut().print(theFilmRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

