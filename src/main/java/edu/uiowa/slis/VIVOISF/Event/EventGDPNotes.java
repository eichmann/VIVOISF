package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventGDPNotesIterator theEvent = (EventGDPNotesIterator)findAncestorWithClass(this, EventGDPNotesIterator.class);
			pageContext.getOut().print(theEvent.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

