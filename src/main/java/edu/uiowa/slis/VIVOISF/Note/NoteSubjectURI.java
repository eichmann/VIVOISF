package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			if (!theNote.commitNeeded) {
				pageContext.getOut().print(theNote.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Note for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			return theNote.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Note for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Note theNote = (Note)findAncestorWithClass(this, Note.class);
			theNote.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Note for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for subjectURI tag ");
		}
	}
}

