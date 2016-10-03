package edu.uiowa.slis.VIVOISF.Film;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FilmEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FilmEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(FilmEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FilmEditorListIterator theFilmEditorListIterator = (FilmEditorListIterator)findAncestorWithClass(this, FilmEditorListIterator.class);
			pageContext.getOut().print(theFilmEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Film for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Film for editorList tag ");
		}
		return SKIP_BODY;
	}
}

