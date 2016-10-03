package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmAuthorListIterator theFilmAuthorListIterator = (FilmAuthorListIterator)findAncestorWithClass(this, FilmAuthorListIterator.class);
			pageContext.getOut().print(theFilmAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for authorList tag ");
		}
		return SKIP_BODY;
	}
}

