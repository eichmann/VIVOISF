package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewOclcnumIterator theReview = (ReviewOclcnumIterator)findAncestorWithClass(this, ReviewOclcnumIterator.class);
			pageContext.getOut().print(theReview.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

