package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteNote extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteNote currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteNoteIterator theNote = (NoteNoteIterator)findAncestorWithClass(this, NoteNoteIterator.class);
			pageContext.getOut().print(theNote.getNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for note tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for note tag ");
		}
		return SKIP_BODY;
	}
}

