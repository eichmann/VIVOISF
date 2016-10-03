package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NotePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(NotePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotePageStartIterator theNote = (NotePageStartIterator)findAncestorWithClass(this, NotePageStartIterator.class);
			pageContext.getOut().print(theNote.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

