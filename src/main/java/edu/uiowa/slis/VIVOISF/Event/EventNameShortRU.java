package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameShortRUIterator theEvent = (EventNameShortRUIterator)findAncestorWithClass(this, EventNameShortRUIterator.class);
			pageContext.getOut().print(theEvent.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

