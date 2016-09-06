package edu.uiowa.slis.VIVOISF.PeerReviewerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeerReviewerRoleBFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeerReviewerRoleBFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(PeerReviewerRoleBFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PeerReviewerRoleBFO_0000054Iterator thePeerReviewerRoleBFO_0000054Iterator = (PeerReviewerRoleBFO_0000054Iterator)findAncestorWithClass(this, PeerReviewerRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(thePeerReviewerRoleBFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing PeerReviewerRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PeerReviewerRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

