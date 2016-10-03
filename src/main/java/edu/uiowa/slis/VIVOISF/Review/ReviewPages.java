package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewPagesIterator theReview = (ReviewPagesIterator)findAncestorWithClass(this, ReviewPagesIterator.class);
			pageContext.getOut().print(theReview.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for pages tag ");
		}
		return SKIP_BODY;
	}
}

