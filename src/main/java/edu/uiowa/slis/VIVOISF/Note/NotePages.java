package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NotePages currentInstance = null;
	private static final Log log = LogFactory.getLog(NotePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotePagesIterator theNote = (NotePagesIterator)findAncestorWithClass(this, NotePagesIterator.class);
			pageContext.getOut().print(theNote.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for pages tag ");
		}
		return SKIP_BODY;
	}
}

