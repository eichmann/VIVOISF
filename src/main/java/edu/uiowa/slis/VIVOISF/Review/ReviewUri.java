package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewUriIterator theReview = (ReviewUriIterator)findAncestorWithClass(this, ReviewUriIterator.class);
			pageContext.getOut().print(theReview.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for uri tag ");
		}
		return SKIP_BODY;
	}
}

