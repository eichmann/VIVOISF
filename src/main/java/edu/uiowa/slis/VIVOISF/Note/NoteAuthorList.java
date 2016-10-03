package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteAuthorListIterator theNoteAuthorListIterator = (NoteAuthorListIterator)findAncestorWithClass(this, NoteAuthorListIterator.class);
			pageContext.getOut().print(theNoteAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for authorList tag ");
		}
		return SKIP_BODY;
	}
}
