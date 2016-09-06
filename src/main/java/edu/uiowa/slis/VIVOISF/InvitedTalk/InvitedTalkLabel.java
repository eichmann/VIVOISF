package edu.uiowa.slis.VIVOISF.InvitedTalk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvitedTalkLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvitedTalkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InvitedTalkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			if (!theInvitedTalk.commitNeeded) {
				pageContext.getOut().print(theInvitedTalk.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			return theInvitedTalk.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing InvitedTalk for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			InvitedTalk theInvitedTalk = (InvitedTalk)findAncestorWithClass(this, InvitedTalk.class);
			theInvitedTalk.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for label tag ");
		}
	}
}

