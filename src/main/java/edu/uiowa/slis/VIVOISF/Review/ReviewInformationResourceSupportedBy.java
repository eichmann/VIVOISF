package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewInformationResourceSupportedByIterator theReviewInformationResourceSupportedByIterator = (ReviewInformationResourceSupportedByIterator)findAncestorWithClass(this, ReviewInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theReviewInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

