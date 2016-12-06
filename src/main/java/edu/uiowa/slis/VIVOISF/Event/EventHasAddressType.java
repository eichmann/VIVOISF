package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasAddressIterator theEventHasAddressIterator = (EventHasAddressIterator)findAncestorWithClass(this, EventHasAddressIterator.class);
			pageContext.getOut().print(theEventHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

