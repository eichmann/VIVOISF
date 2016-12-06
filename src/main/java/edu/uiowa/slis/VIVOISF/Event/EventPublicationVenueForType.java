package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPublicationVenueForIterator theEventPublicationVenueForIterator = (EventPublicationVenueForIterator)findAncestorWithClass(this, EventPublicationVenueForIterator.class);
			pageContext.getOut().print(theEventPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

