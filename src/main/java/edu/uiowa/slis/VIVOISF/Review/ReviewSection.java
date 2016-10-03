package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewSectionIterator theReview = (ReviewSectionIterator)findAncestorWithClass(this, ReviewSectionIterator.class);
			pageContext.getOut().print(theReview.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for section tag ");
		}
		return SKIP_BODY;
	}
}

