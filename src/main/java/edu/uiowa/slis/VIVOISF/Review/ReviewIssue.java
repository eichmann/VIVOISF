package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIssue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIssue currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIssue.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewIssueIterator theReview = (ReviewIssueIterator)findAncestorWithClass(this, ReviewIssueIterator.class);
			pageContext.getOut().print(theReview.getIssue());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for issue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for issue tag ");
		}
		return SKIP_BODY;
	}
}

