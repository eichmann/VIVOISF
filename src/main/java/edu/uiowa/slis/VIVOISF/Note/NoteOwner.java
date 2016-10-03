package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteOwnerIterator theNoteOwnerIterator = (NoteOwnerIterator)findAncestorWithClass(this, NoteOwnerIterator.class);
			pageContext.getOut().print(theNoteOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for owner tag ");
		}
		return SKIP_BODY;
	}
}

