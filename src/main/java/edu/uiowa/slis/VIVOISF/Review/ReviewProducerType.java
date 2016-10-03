package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewProducerIterator theReviewProducerIterator = (ReviewProducerIterator)findAncestorWithClass(this, ReviewProducerIterator.class);
			pageContext.getOut().print(theReviewProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for producer tag ");
		}
		return SKIP_BODY;
	}
}

