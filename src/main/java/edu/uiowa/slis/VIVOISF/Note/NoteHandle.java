package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteHandleIterator theNote = (NoteHandleIterator)findAncestorWithClass(this, NoteHandleIterator.class);
			pageContext.getOut().print(theNote.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for handle tag ");
		}
		return SKIP_BODY;
	}
}

