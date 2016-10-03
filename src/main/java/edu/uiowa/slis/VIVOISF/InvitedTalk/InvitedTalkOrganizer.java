package edu.uiowa.slis.VIVOISF.InvitedTalk;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvitedTalkOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvitedTalkOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(InvitedTalkOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InvitedTalkOrganizerIterator theInvitedTalkOrganizerIterator = (InvitedTalkOrganizerIterator)findAncestorWithClass(this, InvitedTalkOrganizerIterator.class);
			pageContext.getOut().print(theInvitedTalkOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing InvitedTalk for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvitedTalk for organizer tag ");
		}
		return SKIP_BODY;
	}
}

