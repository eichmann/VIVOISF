package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewTheAbstractIterator theReview = (ReviewTheAbstractIterator)findAncestorWithClass(this, ReviewTheAbstractIterator.class);
			pageContext.getOut().print(theReview.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

