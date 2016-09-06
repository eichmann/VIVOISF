package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewHasTranslationIterator theReviewHasTranslationIterator = (ReviewHasTranslationIterator)findAncestorWithClass(this, ReviewHasTranslationIterator.class);
			pageContext.getOut().print(theReviewHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

