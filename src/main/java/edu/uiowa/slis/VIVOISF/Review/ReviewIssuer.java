package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewIssuerIterator theReviewIssuerIterator = (ReviewIssuerIterator)findAncestorWithClass(this, ReviewIssuerIterator.class);
			pageContext.getOut().print(theReviewIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for issuer tag ");
		}
		return SKIP_BODY;
	}
}

