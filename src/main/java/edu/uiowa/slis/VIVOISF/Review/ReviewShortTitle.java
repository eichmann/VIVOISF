package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewShortTitleIterator theReview = (ReviewShortTitleIterator)findAncestorWithClass(this, ReviewShortTitleIterator.class);
			pageContext.getOut().print(theReview.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

