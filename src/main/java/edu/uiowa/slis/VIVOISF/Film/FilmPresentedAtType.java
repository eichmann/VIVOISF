package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmPresentedAtIterator theFilmPresentedAtIterator = (FilmPresentedAtIterator)findAncestorWithClass(this, FilmPresentedAtIterator.class);
			pageContext.getOut().print(theFilmPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

