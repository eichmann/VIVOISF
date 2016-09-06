package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewCitedByIterator theReviewCitedByIterator = (ReviewCitedByIterator)findAncestorWithClass(this, ReviewCitedByIterator.class);
			pageContext.getOut().print(theReviewCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

