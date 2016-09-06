package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmARG_2000028Iterator theFilmARG_2000028Iterator = (FilmARG_2000028Iterator)findAncestorWithClass(this, FilmARG_2000028Iterator.class);
			pageContext.getOut().print(theFilmARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

