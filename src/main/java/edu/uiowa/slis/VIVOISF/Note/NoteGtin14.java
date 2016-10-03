package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteGtin14Iterator theNote = (NoteGtin14Iterator)findAncestorWithClass(this, NoteGtin14Iterator.class);
			pageContext.getOut().print(theNote.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

