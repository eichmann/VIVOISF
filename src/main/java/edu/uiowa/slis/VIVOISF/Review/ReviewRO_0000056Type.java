package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewRO_0000056Iterator theReviewRO_0000056Iterator = (ReviewRO_0000056Iterator)findAncestorWithClass(this, ReviewRO_0000056Iterator.class);
			pageContext.getOut().print(theReviewRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

