package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FilmTheAbstractIterator theFilm = (FilmTheAbstractIterator)findAncestorWithClass(this, FilmTheAbstractIterator.class);
			pageContext.getOut().print(theFilm.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

