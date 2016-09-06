package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReviewVolumeIterator theReview = (ReviewVolumeIterator)findAncestorWithClass(this, ReviewVolumeIterator.class);
			pageContext.getOut().print(theReview.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for volume tag ");
		}
		return SKIP_BODY;
	}
}

