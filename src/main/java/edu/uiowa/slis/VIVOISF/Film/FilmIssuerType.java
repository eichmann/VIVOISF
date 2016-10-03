package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmIssuerIterator theFilmIssuerIterator = (FilmIssuerIterator)findAncestorWithClass(this, FilmIssuerIterator.class);
			pageContext.getOut().print(theFilmIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for issuer tag ");
		}
		return SKIP_BODY;
	}
}

