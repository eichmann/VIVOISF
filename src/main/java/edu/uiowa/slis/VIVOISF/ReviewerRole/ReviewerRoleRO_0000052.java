package edu.uiowa.slis.VIVOISF.ReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewerRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewerRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewerRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewerRoleRO_0000052Iterator theReviewerRoleRO_0000052Iterator = (ReviewerRoleRO_0000052Iterator)findAncestorWithClass(this, ReviewerRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theReviewerRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

