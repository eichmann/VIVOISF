package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewPageStartIterator theReview = (ReviewPageStartIterator)findAncestorWithClass(this, ReviewPageStartIterator.class);
			pageContext.getOut().print(theReview.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

