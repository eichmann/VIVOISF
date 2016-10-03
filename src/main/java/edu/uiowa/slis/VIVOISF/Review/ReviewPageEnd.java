package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewPageEndIterator theReview = (ReviewPageEndIterator)findAncestorWithClass(this, ReviewPageEndIterator.class);
			pageContext.getOut().print(theReview.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

