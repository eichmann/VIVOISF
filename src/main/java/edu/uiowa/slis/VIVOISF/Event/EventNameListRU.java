package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameListRUIterator theEvent = (EventNameListRUIterator)findAncestorWithClass(this, EventNameListRUIterator.class);
			pageContext.getOut().print(theEvent.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

