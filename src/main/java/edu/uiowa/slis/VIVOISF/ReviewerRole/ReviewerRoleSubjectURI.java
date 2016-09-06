package edu.uiowa.slis.VIVOISF.ReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewerRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewerRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewerRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			if (!theReviewerRole.commitNeeded) {
				pageContext.getOut().print(theReviewerRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			return theReviewerRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ReviewerRole theReviewerRole = (ReviewerRole)findAncestorWithClass(this, ReviewerRole.class);
			theReviewerRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReviewerRole for subjectURI tag ");
		}
	}
}

