package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteReviewOfIterator theNoteReviewOfIterator = (NoteReviewOfIterator)findAncestorWithClass(this, NoteReviewOfIterator.class);
			pageContext.getOut().print(theNoteReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

