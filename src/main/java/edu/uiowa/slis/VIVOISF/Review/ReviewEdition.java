package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewEditionIterator theReview = (ReviewEditionIterator)findAncestorWithClass(this, ReviewEditionIterator.class);
			pageContext.getOut().print(theReview.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for edition tag ");
		}
		return SKIP_BODY;
	}
}

