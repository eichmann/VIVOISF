package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewOwnerIterator theReviewOwnerIterator = (ReviewOwnerIterator)findAncestorWithClass(this, ReviewOwnerIterator.class);
			pageContext.getOut().print(theReviewOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for owner tag ");
		}
		return SKIP_BODY;
	}
}

