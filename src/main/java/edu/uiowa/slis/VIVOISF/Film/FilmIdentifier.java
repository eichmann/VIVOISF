package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmIdentifierIterator theFilm = (FilmIdentifierIterator)findAncestorWithClass(this, FilmIdentifierIterator.class);
			pageContext.getOut().print(theFilm.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for identifier tag ");
		}
		return SKIP_BODY;
	}
}

