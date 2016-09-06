package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewHasTranslationIterator theReviewHasTranslationIterator = (ReviewHasTranslationIterator)findAncestorWithClass(this, ReviewHasTranslationIterator.class);
			pageContext.getOut().print(theReviewHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

