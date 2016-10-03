package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmSici currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmSiciIterator theFilm = (FilmSiciIterator)findAncestorWithClass(this, FilmSiciIterator.class);
			pageContext.getOut().print(theFilm.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for sici tag ");
		}
		return SKIP_BODY;
	}
}

