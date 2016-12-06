package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNameOfficialRUIterator theEvent = (EventNameOfficialRUIterator)findAncestorWithClass(this, EventNameOfficialRUIterator.class);
			pageContext.getOut().print(theEvent.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

