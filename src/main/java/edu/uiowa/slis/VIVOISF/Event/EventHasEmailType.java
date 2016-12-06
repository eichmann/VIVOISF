package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventHasEmailIterator theEventHasEmailIterator = (EventHasEmailIterator)findAncestorWithClass(this, EventHasEmailIterator.class);
			pageContext.getOut().print(theEventHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

