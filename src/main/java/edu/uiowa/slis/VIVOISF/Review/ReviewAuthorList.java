package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewAuthorListIterator theReviewAuthorListIterator = (ReviewAuthorListIterator)findAncestorWithClass(this, ReviewAuthorListIterator.class);
			pageContext.getOut().print(theReviewAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for authorList tag ");
		}
		return SKIP_BODY;
	}
}

