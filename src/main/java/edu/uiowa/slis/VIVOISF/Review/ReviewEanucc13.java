package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewEanucc13Iterator theReview = (ReviewEanucc13Iterator)findAncestorWithClass(this, ReviewEanucc13Iterator.class);
			pageContext.getOut().print(theReview.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

