package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewContentIterator theReview = (ReviewContentIterator)findAncestorWithClass(this, ReviewContentIterator.class);
			pageContext.getOut().print(theReview.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for content tag ");
		}
		return SKIP_BODY;
	}
}

