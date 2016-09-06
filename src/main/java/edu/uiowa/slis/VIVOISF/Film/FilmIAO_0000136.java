package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmIAO_0000136Iterator theFilmIAO_0000136Iterator = (FilmIAO_0000136Iterator)findAncestorWithClass(this, FilmIAO_0000136Iterator.class);
			pageContext.getOut().print(theFilmIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

