package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteEanucc13Iterator theNote = (NoteEanucc13Iterator)findAncestorWithClass(this, NoteEanucc13Iterator.class);
			pageContext.getOut().print(theNote.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

