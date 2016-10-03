package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewEditorListIterator theReviewEditorListIterator = (ReviewEditorListIterator)findAncestorWithClass(this, ReviewEditorListIterator.class);
			pageContext.getOut().print(theReviewEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for editorList tag ");
		}
		return SKIP_BODY;
	}
}

