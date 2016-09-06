package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewARG_2000028Iterator theReviewARG_2000028Iterator = (ReviewARG_2000028Iterator)findAncestorWithClass(this, ReviewARG_2000028Iterator.class);
			pageContext.getOut().print(theReviewARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Review for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

