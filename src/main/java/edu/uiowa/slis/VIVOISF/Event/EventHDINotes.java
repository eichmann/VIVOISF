package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(EventHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventHDINotesIterator theEvent = (EventHDINotesIterator)findAncestorWithClass(this, EventHDINotesIterator.class);
			pageContext.getOut().print(theEvent.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

