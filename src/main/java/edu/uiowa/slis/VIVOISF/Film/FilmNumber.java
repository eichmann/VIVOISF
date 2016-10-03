package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmNumberIterator theFilm = (FilmNumberIterator)findAncestorWithClass(this, FilmNumberIterator.class);
			pageContext.getOut().print(theFilm.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for number tag ");
		}
		return SKIP_BODY;
	}
}

