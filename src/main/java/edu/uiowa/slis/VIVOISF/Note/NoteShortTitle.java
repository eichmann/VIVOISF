package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteShortTitleIterator theNote = (NoteShortTitleIterator)findAncestorWithClass(this, NoteShortTitleIterator.class);
			pageContext.getOut().print(theNote.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

