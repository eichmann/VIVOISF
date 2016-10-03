package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteEditorListIterator theNoteEditorListIterator = (NoteEditorListIterator)findAncestorWithClass(this, NoteEditorListIterator.class);
			pageContext.getOut().print(theNoteEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for editorList tag ");
		}
		return SKIP_BODY;
	}
}

