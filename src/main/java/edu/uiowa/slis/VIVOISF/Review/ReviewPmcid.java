package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewPmcid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewPmcid currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewPmcid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewPmcidIterator theReview = (ReviewPmcidIterator)findAncestorWithClass(this, ReviewPmcidIterator.class);
			pageContext.getOut().print(theReview.getPmcid());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for pmcid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for pmcid tag ");
		}
		return SKIP_BODY;
	}
}

