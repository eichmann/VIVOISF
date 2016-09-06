package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteARG_0000001Iterator theNote = (NoteARG_0000001Iterator)findAncestorWithClass(this, NoteARG_0000001Iterator.class);
			pageContext.getOut().print(theNote.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

