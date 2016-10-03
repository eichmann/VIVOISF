package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteNumPagesIterator theNote = (NoteNumPagesIterator)findAncestorWithClass(this, NoteNumPagesIterator.class);
			pageContext.getOut().print(theNote.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for numPages tag ");
		}
		return SKIP_BODY;
	}
}

