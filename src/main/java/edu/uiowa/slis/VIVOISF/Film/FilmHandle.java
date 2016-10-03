package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmHandleIterator theFilm = (FilmHandleIterator)findAncestorWithClass(this, FilmHandleIterator.class);
			pageContext.getOut().print(theFilm.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for handle tag ");
		}
		return SKIP_BODY;
	}
}

