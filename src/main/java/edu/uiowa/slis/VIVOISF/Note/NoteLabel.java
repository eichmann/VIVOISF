package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			if (!theNote.commitNeeded) {
				pageContext.getOut().print(theNote.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Note for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			return theNote.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Note for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			theNote.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Note for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for label tag ");
		}
	}
}

