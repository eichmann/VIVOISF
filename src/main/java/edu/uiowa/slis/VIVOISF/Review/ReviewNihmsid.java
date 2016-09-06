package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewNihmsid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewNihmsid currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewNihmsid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewNihmsidIterator theReview = (ReviewNihmsidIterator)findAncestorWithClass(this, ReviewNihmsidIterator.class);
			pageContext.getOut().print(theReview.getNihmsid());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for nihmsid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for nihmsid tag ");
		}
		return SKIP_BODY;
	}
}

