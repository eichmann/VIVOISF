package edu.uiowa.slis.VIVOISF.InvitedTalk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvitedTalkRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvitedTalkRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(InvitedTalkRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvitedTalkRO_0000057Iterator theInvitedTalkRO_0000057Iterator = (InvitedTalkRO_0000057Iterator)findAncestorWithClass(this, InvitedTalkRO_0000057Iterator.class);
			pageContext.getOut().print(theInvitedTalkRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

