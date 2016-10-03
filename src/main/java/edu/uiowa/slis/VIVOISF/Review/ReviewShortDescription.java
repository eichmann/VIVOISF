package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewShortDescriptionIterator theReview = (ReviewShortDescriptionIterator)findAncestorWithClass(this, ReviewShortDescriptionIterator.class);
			pageContext.getOut().print(theReview.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

