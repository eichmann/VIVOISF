package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewDoiIterator theReview = (ReviewDoiIterator)findAncestorWithClass(this, ReviewDoiIterator.class);
			pageContext.getOut().print(theReview.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for doi tag ");
		}
		return SKIP_BODY;
	}
}

