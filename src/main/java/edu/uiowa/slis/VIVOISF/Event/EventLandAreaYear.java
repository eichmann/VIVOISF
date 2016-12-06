package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventLandAreaYearIterator theEvent = (EventLandAreaYearIterator)findAncestorWithClass(this, EventLandAreaYearIterator.class);
			pageContext.getOut().print(theEvent.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

