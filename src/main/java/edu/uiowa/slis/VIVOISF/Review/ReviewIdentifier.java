package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewIdentifierIterator theReview = (ReviewIdentifierIterator)findAncestorWithClass(this, ReviewIdentifierIterator.class);
			pageContext.getOut().print(theReview.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for identifier tag ");
		}
		return SKIP_BODY;
	}
}

