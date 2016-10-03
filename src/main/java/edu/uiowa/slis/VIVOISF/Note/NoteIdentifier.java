package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteIdentifierIterator theNote = (NoteIdentifierIterator)findAncestorWithClass(this, NoteIdentifierIterator.class);
			pageContext.getOut().print(theNote.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for identifier tag ");
		}
		return SKIP_BODY;
	}
}

