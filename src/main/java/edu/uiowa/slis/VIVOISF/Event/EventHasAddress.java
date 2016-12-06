package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasAddressIterator theEventHasAddressIterator = (EventHasAddressIterator)findAncestorWithClass(this, EventHasAddressIterator.class);
			pageContext.getOut().print(theEventHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

