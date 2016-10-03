package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NotePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(NotePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotePageEndIterator theNote = (NotePageEndIterator)findAncestorWithClass(this, NotePageEndIterator.class);
			pageContext.getOut().print(theNote.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

