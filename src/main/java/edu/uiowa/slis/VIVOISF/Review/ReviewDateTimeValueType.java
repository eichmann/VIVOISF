package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewDateTimeValueIterator theReviewDateTimeValueIterator = (ReviewDateTimeValueIterator)findAncestorWithClass(this, ReviewDateTimeValueIterator.class);
			pageContext.getOut().print(theReviewDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

