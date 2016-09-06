package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmTranslatorIterator theFilmTranslatorIterator = (FilmTranslatorIterator)findAncestorWithClass(this, FilmTranslatorIterator.class);
			pageContext.getOut().print(theFilmTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for translator tag ");
		}
		return SKIP_BODY;
	}
}

