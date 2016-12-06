package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(EventLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventLandAreaTotalIterator theEvent = (EventLandAreaTotalIterator)findAncestorWithClass(this, EventLandAreaTotalIterator.class);
			pageContext.getOut().print(theEvent.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

