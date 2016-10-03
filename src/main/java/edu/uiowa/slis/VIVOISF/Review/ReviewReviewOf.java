package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewReviewOfIterator theReviewReviewOfIterator = (ReviewReviewOfIterator)findAncestorWithClass(this, ReviewReviewOfIterator.class);
			pageContext.getOut().print(theReviewReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

