package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteIAO_0000136Iterator theNoteIAO_0000136Iterator = (NoteIAO_0000136Iterator)findAncestorWithClass(this, NoteIAO_0000136Iterator.class);
			pageContext.getOut().print(theNoteIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

