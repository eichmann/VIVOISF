package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(EventDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventDescriptionIterator theEvent = (EventDescriptionIterator)findAncestorWithClass(this, EventDescriptionIterator.class);
			pageContext.getOut().print(theEvent.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for description tag ");
		}
		return SKIP_BODY;
	}
}

