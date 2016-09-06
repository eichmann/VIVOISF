package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleRO_0000052Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleRO_0000052Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleRO_0000052Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRoleRO_0000052Iterator thePeerReviewerRoleRO_0000052Iterator = (PeerReviewerRoleRO_0000052Iterator)findAncestorWithClass(this, PeerReviewerRoleRO_0000052Iterator.class);
			pageContext.getOut().print(thePeerReviewerRoleRO_0000052Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

