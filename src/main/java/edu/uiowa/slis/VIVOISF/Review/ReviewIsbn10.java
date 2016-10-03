package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewIsbn10Iterator theReview = (ReviewIsbn10Iterator)findAncestorWithClass(this, ReviewIsbn10Iterator.class);
			pageContext.getOut().print(theReview.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

