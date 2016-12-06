package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasNameIterator theEventHasNameIterator = (EventHasNameIterator)findAncestorWithClass(this, EventHasNameIterator.class);
			pageContext.getOut().print(theEventHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasName tag ");
		}
		return SKIP_BODY;
	}
}

