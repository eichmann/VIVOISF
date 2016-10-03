package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteEditorIterator theNoteEditorIterator = (NoteEditorIterator)findAncestorWithClass(this, NoteEditorIterator.class);
			pageContext.getOut().print(theNoteEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for editor tag ");
		}
		return SKIP_BODY;
	}
}

