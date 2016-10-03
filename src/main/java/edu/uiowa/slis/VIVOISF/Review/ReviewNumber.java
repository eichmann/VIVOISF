package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewNumberIterator theReview = (ReviewNumberIterator)findAncestorWithClass(this, ReviewNumberIterator.class);
			pageContext.getOut().print(theReview.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for number tag ");
		}
		return SKIP_BODY;
	}
}

