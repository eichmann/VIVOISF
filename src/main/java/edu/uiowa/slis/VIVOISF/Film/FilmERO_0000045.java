package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmERO_0000045Iterator theFilm = (FilmERO_0000045Iterator)findAncestorWithClass(this, FilmERO_0000045Iterator.class);
			pageContext.getOut().print(theFilm.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

