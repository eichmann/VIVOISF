package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewSiciIterator theReview = (ReviewSiciIterator)findAncestorWithClass(this, ReviewSiciIterator.class);
			pageContext.getOut().print(theReview.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for sici tag ");
		}
		return SKIP_BODY;
	}
}

