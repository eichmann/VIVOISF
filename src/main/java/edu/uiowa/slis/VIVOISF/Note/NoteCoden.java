package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteCodenIterator theNote = (NoteCodenIterator)findAncestorWithClass(this, NoteCodenIterator.class);
			pageContext.getOut().print(theNote.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for coden tag ");
		}
		return SKIP_BODY;
	}
}

