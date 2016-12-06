package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasURLIterator theEventHasURLIterator = (EventHasURLIterator)findAncestorWithClass(this, EventHasURLIterator.class);
			pageContext.getOut().print(theEventHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

