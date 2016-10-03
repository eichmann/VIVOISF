package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewHandleIterator theReview = (ReviewHandleIterator)findAncestorWithClass(this, ReviewHandleIterator.class);
			pageContext.getOut().print(theReview.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for handle tag ");
		}
		return SKIP_BODY;
	}
}

