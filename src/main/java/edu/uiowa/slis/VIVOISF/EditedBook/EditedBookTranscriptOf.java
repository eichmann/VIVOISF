package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookTranscriptOfIterator theEditedBookTranscriptOfIterator = (EditedBookTranscriptOfIterator)findAncestorWithClass(this, EditedBookTranscriptOfIterator.class);
			pageContext.getOut().print(theEditedBookTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

