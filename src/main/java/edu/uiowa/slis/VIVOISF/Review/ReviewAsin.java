package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewAsinIterator theReview = (ReviewAsinIterator)findAncestorWithClass(this, ReviewAsinIterator.class);
			pageContext.getOut().print(theReview.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for asin tag ");
		}
		return SKIP_BODY;
	}
}

