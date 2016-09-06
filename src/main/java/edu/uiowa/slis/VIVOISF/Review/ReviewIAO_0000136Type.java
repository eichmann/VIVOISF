package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewIAO_0000136Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewIAO_0000136Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewIAO_0000136Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewIAO_0000136Iterator theReviewIAO_0000136Iterator = (ReviewIAO_0000136Iterator)findAncestorWithClass(this, ReviewIAO_0000136Iterator.class);
			pageContext.getOut().print(theReviewIAO_0000136Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

