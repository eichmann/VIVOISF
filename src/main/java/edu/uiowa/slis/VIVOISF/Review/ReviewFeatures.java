package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewFeaturesIterator theReviewFeaturesIterator = (ReviewFeaturesIterator)findAncestorWithClass(this, ReviewFeaturesIterator.class);
			pageContext.getOut().print(theReviewFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for features tag ");
		}
		return SKIP_BODY;
	}
}

