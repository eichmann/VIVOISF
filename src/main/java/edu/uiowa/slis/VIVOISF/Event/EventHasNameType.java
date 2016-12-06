package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasNameIterator theEventHasNameIterator = (EventHasNameIterator)findAncestorWithClass(this, EventHasNameIterator.class);
			pageContext.getOut().print(theEventHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasName tag ");
		}
		return SKIP_BODY;
	}
}

