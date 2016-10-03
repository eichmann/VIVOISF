package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteUpcIterator theNote = (NoteUpcIterator)findAncestorWithClass(this, NoteUpcIterator.class);
			pageContext.getOut().print(theNote.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for upc tag ");
		}
		return SKIP_BODY;
	}
}

