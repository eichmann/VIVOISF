package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteEditionIterator theNote = (NoteEditionIterator)findAncestorWithClass(this, NoteEditionIterator.class);
			pageContext.getOut().print(theNote.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for edition tag ");
		}
		return SKIP_BODY;
	}
}

