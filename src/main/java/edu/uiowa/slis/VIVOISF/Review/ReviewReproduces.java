package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewReproducesIterator theReviewReproducesIterator = (ReviewReproducesIterator)findAncestorWithClass(this, ReviewReproducesIterator.class);
			pageContext.getOut().print(theReviewReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

