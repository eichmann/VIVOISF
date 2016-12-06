package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventCountryAreaNotesIterator theEvent = (EventCountryAreaNotesIterator)findAncestorWithClass(this, EventCountryAreaNotesIterator.class);
			pageContext.getOut().print(theEvent.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

