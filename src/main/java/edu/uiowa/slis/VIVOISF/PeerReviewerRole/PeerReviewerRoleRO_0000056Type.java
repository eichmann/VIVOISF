package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRoleRO_0000056Iterator thePeerReviewerRoleRO_0000056Iterator = (PeerReviewerRoleRO_0000056Iterator)findAncestorWithClass(this, PeerReviewerRoleRO_0000056Iterator.class);
			pageContext.getOut().print(thePeerReviewerRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

