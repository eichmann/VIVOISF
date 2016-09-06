package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			if (!thePeerReviewerRole.commitNeeded) {
				pageContext.getOut().print(thePeerReviewerRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			return thePeerReviewerRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PeerReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PeerReviewerRole thePeerReviewerRole = (PeerReviewerRole)findAncestorWithClass(this, PeerReviewerRole.class);
			thePeerReviewerRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for label tag ");
		}
	}
}

