package edu.uiowa.slis.VIVOISF.ReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewerRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewerRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewerRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewerRoleBFO_0000054Iterator theReviewerRoleBFO_0000054Iterator = (ReviewerRoleBFO_0000054Iterator)findAncestorWithClass(this, ReviewerRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theReviewerRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

