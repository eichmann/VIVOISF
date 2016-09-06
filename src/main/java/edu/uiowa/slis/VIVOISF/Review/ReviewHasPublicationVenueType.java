package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewHasPublicationVenueIterator theReviewHasPublicationVenueIterator = (ReviewHasPublicationVenueIterator)findAncestorWithClass(this, ReviewHasPublicationVenueIterator.class);
			pageContext.getOut().print(theReviewHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

