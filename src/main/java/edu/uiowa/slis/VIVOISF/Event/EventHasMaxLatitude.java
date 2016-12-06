package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHasMaxLatitudeIterator theEvent = (EventHasMaxLatitudeIterator)findAncestorWithClass(this, EventHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theEvent.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

