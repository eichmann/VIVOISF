package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteStatusIterator theNoteStatusIterator = (NoteStatusIterator)findAncestorWithClass(this, NoteStatusIterator.class);
			pageContext.getOut().print(theNoteStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for status tag ");
		}
		return SKIP_BODY;
	}
}

