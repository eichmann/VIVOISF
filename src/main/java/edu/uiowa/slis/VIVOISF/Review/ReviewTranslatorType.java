package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewTranslatorIterator theReviewTranslatorIterator = (ReviewTranslatorIterator)findAncestorWithClass(this, ReviewTranslatorIterator.class);
			pageContext.getOut().print(theReviewTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for translator tag ");
		}
		return SKIP_BODY;
	}
}

