package edu.uiowa.slis.VIVOISF.Meeting;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeetingOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MeetingOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(MeetingOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MeetingOrganizerIterator theMeetingOrganizerIterator = (MeetingOrganizerIterator)findAncestorWithClass(this, MeetingOrganizerIterator.class);
			pageContext.getOut().print(theMeetingOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Meeting for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Meeting for organizer tag ");
		}
		return SKIP_BODY;
	}
}

