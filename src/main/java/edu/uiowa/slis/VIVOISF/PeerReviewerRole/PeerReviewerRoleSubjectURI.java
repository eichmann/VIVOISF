package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			if (!thePeerReviewerRole.commitNeeded) {
				pageContext.getOut().print(thePeerReviewerRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			return thePeerReviewerRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PeerReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			thePeerReviewerRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for subjectURI tag ");
		}
	}
}

