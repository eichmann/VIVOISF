package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmARG_0000001Iterator theFilm = (FilmARG_0000001Iterator)findAncestorWithClass(this, FilmARG_0000001Iterator.class);
			pageContext.getOut().print(theFilm.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

