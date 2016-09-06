package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewTranslationOfIterator theReviewTranslationOfIterator = (ReviewTranslationOfIterator)findAncestorWithClass(this, ReviewTranslationOfIterator.class);
			pageContext.getOut().print(theReviewTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

