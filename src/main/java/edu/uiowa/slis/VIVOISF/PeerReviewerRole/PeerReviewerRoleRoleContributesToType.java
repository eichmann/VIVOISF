package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRoleRoleContributesToIterator thePeerReviewerRoleRoleContributesToIterator = (PeerReviewerRoleRoleContributesToIterator)findAncestorWithClass(this, PeerReviewerRoleRoleContributesToIterator.class);
			pageContext.getOut().print(thePeerReviewerRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

