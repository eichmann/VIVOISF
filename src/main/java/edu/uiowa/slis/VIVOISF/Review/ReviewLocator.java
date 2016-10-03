package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewLocatorIterator theReview = (ReviewLocatorIterator)findAncestorWithClass(this, ReviewLocatorIterator.class);
			pageContext.getOut().print(theReview.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for locator tag ");
		}
		return SKIP_BODY;
	}
}

