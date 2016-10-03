package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewCodenIterator theReview = (ReviewCodenIterator)findAncestorWithClass(this, ReviewCodenIterator.class);
			pageContext.getOut().print(theReview.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for coden tag ");
		}
		return SKIP_BODY;
	}
}

