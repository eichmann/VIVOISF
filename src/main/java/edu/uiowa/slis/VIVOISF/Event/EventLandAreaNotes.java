package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventLandAreaNotesIterator theEvent = (EventLandAreaNotesIterator)findAncestorWithClass(this, EventLandAreaNotesIterator.class);
			pageContext.getOut().print(theEvent.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

