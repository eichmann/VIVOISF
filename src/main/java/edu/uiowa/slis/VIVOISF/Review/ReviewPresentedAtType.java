package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewPresentedAtIterator theReviewPresentedAtIterator = (ReviewPresentedAtIterator)findAncestorWithClass(this, ReviewPresentedAtIterator.class);
			pageContext.getOut().print(theReviewPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

