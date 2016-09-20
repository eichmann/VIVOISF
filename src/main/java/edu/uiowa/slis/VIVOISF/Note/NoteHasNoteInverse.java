package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteHasNoteInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteHasNoteInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteHasNoteInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteHasNoteInverseIterator theNoteHasNoteInverseIterator = (NoteHasNoteInverseIterator)findAncestorWithClass(this, NoteHasNoteInverseIterator.class);
			pageContext.getOut().print(theNoteHasNoteInverseIterator.getHasNoteInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for hasNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for hasNote tag ");
		}
		return SKIP_BODY;
	}
}

