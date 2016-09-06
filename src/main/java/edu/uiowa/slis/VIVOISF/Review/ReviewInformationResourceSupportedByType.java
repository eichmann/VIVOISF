package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewInformationResourceSupportedByIterator theReviewInformationResourceSupportedByIterator = (ReviewInformationResourceSupportedByIterator)findAncestorWithClass(this, ReviewInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theReviewInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

