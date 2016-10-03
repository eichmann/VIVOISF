package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteShortDescriptionIterator theNote = (NoteShortDescriptionIterator)findAncestorWithClass(this, NoteShortDescriptionIterator.class);
			pageContext.getOut().print(theNote.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

