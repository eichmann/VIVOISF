package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasPublicationVenueIterator theEventHasPublicationVenueIterator = (EventHasPublicationVenueIterator)findAncestorWithClass(this, EventHasPublicationVenueIterator.class);
			pageContext.getOut().print(theEventHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

