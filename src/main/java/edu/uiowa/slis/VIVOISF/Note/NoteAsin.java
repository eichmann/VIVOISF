package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteAsinIterator theNote = (NoteAsinIterator)findAncestorWithClass(this, NoteAsinIterator.class);
			pageContext.getOut().print(theNote.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for asin tag ");
		}
		return SKIP_BODY;
	}
}

