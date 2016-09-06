package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewDocumentationForIterator theReviewDocumentationForIterator = (ReviewDocumentationForIterator)findAncestorWithClass(this, ReviewDocumentationForIterator.class);
			pageContext.getOut().print(theReviewDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

