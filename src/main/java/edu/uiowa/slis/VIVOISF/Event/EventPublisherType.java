package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventPublisherIterator theEventPublisherIterator = (EventPublisherIterator)findAncestorWithClass(this, EventPublisherIterator.class);
			pageContext.getOut().print(theEventPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for publisher tag ");
		}
		return SKIP_BODY;
	}
}

