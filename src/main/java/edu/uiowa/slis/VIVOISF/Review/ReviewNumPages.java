package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewNumPagesIterator theReview = (ReviewNumPagesIterator)findAncestorWithClass(this, ReviewNumPagesIterator.class);
			pageContext.getOut().print(theReview.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for numPages tag ");
		}
		return SKIP_BODY;
	}
}

