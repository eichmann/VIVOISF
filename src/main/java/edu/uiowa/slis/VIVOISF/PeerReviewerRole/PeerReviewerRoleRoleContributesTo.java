package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRoleRoleContributesToIterator thePeerReviewerRoleRoleContributesToIterator = (PeerReviewerRoleRoleContributesToIterator)findAncestorWithClass(this, PeerReviewerRoleRoleContributesToIterator.class);
			pageContext.getOut().print(thePeerReviewerRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

