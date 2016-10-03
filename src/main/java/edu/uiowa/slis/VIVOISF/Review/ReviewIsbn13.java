package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewIsbn13Iterator theReview = (ReviewIsbn13Iterator)findAncestorWithClass(this, ReviewIsbn13Iterator.class);
			pageContext.getOut().print(theReview.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

