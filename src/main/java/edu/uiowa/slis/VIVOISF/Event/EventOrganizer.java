package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventOrganizer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventOrganizer currentInstance = null;
	private static final Log log = LogFactory.getLog(EventOrganizer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventOrganizerIterator theEventOrganizerIterator = (EventOrganizerIterator)findAncestorWithClass(this, EventOrganizerIterator.class);
			pageContext.getOut().print(theEventOrganizerIterator.getOrganizer());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for organizer tag ");
		}
		return SKIP_BODY;
	}
}

