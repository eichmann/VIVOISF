package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteNumberIterator theNote = (NoteNumberIterator)findAncestorWithClass(this, NoteNumberIterator.class);
			pageContext.getOut().print(theNote.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for number tag ");
		}
		return SKIP_BODY;
	}
}

