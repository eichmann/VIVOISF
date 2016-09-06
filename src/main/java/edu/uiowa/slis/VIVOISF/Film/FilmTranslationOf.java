package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmTranslationOfIterator theFilmTranslationOfIterator = (FilmTranslationOfIterator)findAncestorWithClass(this, FilmTranslationOfIterator.class);
			pageContext.getOut().print(theFilmTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

