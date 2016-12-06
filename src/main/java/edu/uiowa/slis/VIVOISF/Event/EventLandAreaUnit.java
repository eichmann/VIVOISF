package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventLandAreaUnitIterator theEvent = (EventLandAreaUnitIterator)findAncestorWithClass(this, EventLandAreaUnitIterator.class);
			pageContext.getOut().print(theEvent.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

