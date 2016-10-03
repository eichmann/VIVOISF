package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewEditorIterator theReviewEditorIterator = (ReviewEditorIterator)findAncestorWithClass(this, ReviewEditorIterator.class);
			pageContext.getOut().print(theReviewEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for editor tag ");
		}
		return SKIP_BODY;
	}
}

