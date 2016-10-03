package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewLccnIterator theReview = (ReviewLccnIterator)findAncestorWithClass(this, ReviewLccnIterator.class);
			pageContext.getOut().print(theReview.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for lccn tag ");
		}
		return SKIP_BODY;
	}
}

