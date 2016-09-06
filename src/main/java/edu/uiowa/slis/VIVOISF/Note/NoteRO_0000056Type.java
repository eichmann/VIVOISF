package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteRO_0000056Iterator theNoteRO_0000056Iterator = (NoteRO_0000056Iterator)findAncestorWithClass(this, NoteRO_0000056Iterator.class);
			pageContext.getOut().print(theNoteRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

