package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewReproducedInIterator theReviewReproducedInIterator = (ReviewReproducedInIterator)findAncestorWithClass(this, ReviewReproducedInIterator.class);
			pageContext.getOut().print(theReviewReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

