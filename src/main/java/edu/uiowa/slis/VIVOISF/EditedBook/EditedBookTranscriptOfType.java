package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditedBookTranscriptOfIterator theEditedBookTranscriptOfIterator = (EditedBookTranscriptOfIterator)findAncestorWithClass(this, EditedBookTranscriptOfIterator.class);
			pageContext.getOut().print(theEditedBookTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

