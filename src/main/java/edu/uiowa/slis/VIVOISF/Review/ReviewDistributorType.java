package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewDistributorIterator theReviewDistributorIterator = (ReviewDistributorIterator)findAncestorWithClass(this, ReviewDistributorIterator.class);
			pageContext.getOut().print(theReviewDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for distributor tag ");
		}
		return SKIP_BODY;
	}
}

