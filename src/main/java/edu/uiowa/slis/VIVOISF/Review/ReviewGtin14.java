package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewGtin14Iterator theReview = (ReviewGtin14Iterator)findAncestorWithClass(this, ReviewGtin14Iterator.class);
			pageContext.getOut().print(theReview.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

