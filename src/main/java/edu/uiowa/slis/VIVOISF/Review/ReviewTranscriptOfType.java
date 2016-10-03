package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewTranscriptOfIterator theReviewTranscriptOfIterator = (ReviewTranscriptOfIterator)findAncestorWithClass(this, ReviewTranscriptOfIterator.class);
			pageContext.getOut().print(theReviewTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

