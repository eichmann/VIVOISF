package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewRelatedByIterator theReviewRelatedByIterator = (ReviewRelatedByIterator)findAncestorWithClass(this, ReviewRelatedByIterator.class);
			pageContext.getOut().print(theReviewRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

