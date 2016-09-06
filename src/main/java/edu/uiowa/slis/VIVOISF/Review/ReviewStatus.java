package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewStatusIterator theReviewStatusIterator = (ReviewStatusIterator)findAncestorWithClass(this, ReviewStatusIterator.class);
			pageContext.getOut().print(theReviewStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for status tag ");
		}
		return SKIP_BODY;
	}
}

