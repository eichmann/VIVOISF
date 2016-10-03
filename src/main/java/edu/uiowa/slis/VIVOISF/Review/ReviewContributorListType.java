package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewContributorListIterator theReviewContributorListIterator = (ReviewContributorListIterator)findAncestorWithClass(this, ReviewContributorListIterator.class);
			pageContext.getOut().print(theReviewContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

