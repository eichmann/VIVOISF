package edu.uiowa.slis.VIVOISF.InvitedTalk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvitedTalkBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvitedTalkBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(InvitedTalkBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvitedTalkBFO_0000055Iterator theInvitedTalkBFO_0000055Iterator = (InvitedTalkBFO_0000055Iterator)findAncestorWithClass(this, InvitedTalkBFO_0000055Iterator.class);
			pageContext.getOut().print(theInvitedTalkBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

