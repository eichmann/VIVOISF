package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteAnnotates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteAnnotates currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteAnnotates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteAnnotatesIterator theNoteAnnotatesIterator = (NoteAnnotatesIterator)findAncestorWithClass(this, NoteAnnotatesIterator.class);
			pageContext.getOut().print(theNoteAnnotatesIterator.getAnnotates());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for annotates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for annotates tag ");
		}
		return SKIP_BODY;
	}
}

