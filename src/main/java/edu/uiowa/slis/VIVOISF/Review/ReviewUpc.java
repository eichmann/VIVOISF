package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewUpcIterator theReview = (ReviewUpcIterator)findAncestorWithClass(this, ReviewUpcIterator.class);
			pageContext.getOut().print(theReview.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for upc tag ");
		}
		return SKIP_BODY;
	}
}

