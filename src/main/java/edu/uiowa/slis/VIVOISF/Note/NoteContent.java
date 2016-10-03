package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteContent currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteContentIterator theNote = (NoteContentIterator)findAncestorWithClass(this, NoteContentIterator.class);
			pageContext.getOut().print(theNote.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for content tag ");
		}
		return SKIP_BODY;
	}
}

