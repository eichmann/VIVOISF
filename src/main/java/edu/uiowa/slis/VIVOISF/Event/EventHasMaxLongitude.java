package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHasMaxLongitudeIterator theEvent = (EventHasMaxLongitudeIterator)findAncestorWithClass(this, EventHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theEvent.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

