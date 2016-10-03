package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmOwnerIterator theFilmOwnerIterator = (FilmOwnerIterator)findAncestorWithClass(this, FilmOwnerIterator.class);
			pageContext.getOut().print(theFilmOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for owner tag ");
		}
		return SKIP_BODY;
	}
}

