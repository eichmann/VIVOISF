package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteSection currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteSectionIterator theNote = (NoteSectionIterator)findAncestorWithClass(this, NoteSectionIterator.class);
			pageContext.getOut().print(theNote.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for section tag ");
		}
		return SKIP_BODY;
	}
}

