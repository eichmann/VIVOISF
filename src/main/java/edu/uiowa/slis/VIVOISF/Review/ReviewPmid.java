package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewPmidIterator theReview = (ReviewPmidIterator)findAncestorWithClass(this, ReviewPmidIterator.class);
			pageContext.getOut().print(theReview.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for pmid tag ");
		}
		return SKIP_BODY;
	}
}

