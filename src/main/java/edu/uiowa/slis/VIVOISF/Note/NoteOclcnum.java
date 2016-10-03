package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteOclcnumIterator theNote = (NoteOclcnumIterator)findAncestorWithClass(this, NoteOclcnumIterator.class);
			pageContext.getOut().print(theNote.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

