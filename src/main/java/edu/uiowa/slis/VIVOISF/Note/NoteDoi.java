package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteDoiIterator theNote = (NoteDoiIterator)findAncestorWithClass(this, NoteDoiIterator.class);
			pageContext.getOut().print(theNote.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for doi tag ");
		}
		return SKIP_BODY;
	}
}

