package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewRelatesIterator theReviewRelatesIterator = (ReviewRelatesIterator)findAncestorWithClass(this, ReviewRelatesIterator.class);
			pageContext.getOut().print(theReviewRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for relates tag ");
		}
		return SKIP_BODY;
	}
}

