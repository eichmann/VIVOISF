package edu.uiowa.slis.VIVOISF.ReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewerRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewerRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewerRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			if (!theReviewerRole.commitNeeded) {
				pageContext.getOut().print(theReviewerRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			return theReviewerRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			theReviewerRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for label tag ");
		}
	}
}

