package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteUri currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteUriIterator theNote = (NoteUriIterator)findAncestorWithClass(this, NoteUriIterator.class);
			pageContext.getOut().print(theNote.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for uri tag ");
		}
		return SKIP_BODY;
	}
}

