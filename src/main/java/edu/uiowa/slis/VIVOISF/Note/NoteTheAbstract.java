package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteTheAbstractIterator theNote = (NoteTheAbstractIterator)findAncestorWithClass(this, NoteTheAbstractIterator.class);
			pageContext.getOut().print(theNote.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

