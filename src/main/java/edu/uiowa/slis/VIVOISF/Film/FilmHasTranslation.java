package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmHasTranslationIterator theFilmHasTranslationIterator = (FilmHasTranslationIterator)findAncestorWithClass(this, FilmHasTranslationIterator.class);
			pageContext.getOut().print(theFilmHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

