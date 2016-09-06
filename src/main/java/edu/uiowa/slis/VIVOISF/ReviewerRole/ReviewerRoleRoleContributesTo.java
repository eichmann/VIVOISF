package edu.uiowa.slis.VIVOISF.ReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewerRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewerRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewerRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReviewerRoleRoleContributesToIterator theReviewerRoleRoleContributesToIterator = (ReviewerRoleRoleContributesToIterator)findAncestorWithClass(this, ReviewerRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theReviewerRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

