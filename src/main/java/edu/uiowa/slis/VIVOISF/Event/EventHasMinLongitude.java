package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHasMinLongitudeIterator theEvent = (EventHasMinLongitudeIterator)findAncestorWithClass(this, EventHasMinLongitudeIterator.class);
			pageContext.getOut().print(theEvent.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

