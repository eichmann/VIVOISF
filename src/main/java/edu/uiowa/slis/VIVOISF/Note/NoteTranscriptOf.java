package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteTranscriptOfIterator theNoteTranscriptOfIterator = (NoteTranscriptOfIterator)findAncestorWithClass(this, NoteTranscriptOfIterator.class);
			pageContext.getOut().print(theNoteTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

