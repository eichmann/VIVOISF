package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteDocumentationForIterator theNoteDocumentationForIterator = (NoteDocumentationForIterator)findAncestorWithClass(this, NoteDocumentationForIterator.class);
			pageContext.getOut().print(theNoteDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

