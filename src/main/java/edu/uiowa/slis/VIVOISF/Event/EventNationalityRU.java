package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityRUIterator theEvent = (EventNationalityRUIterator)findAncestorWithClass(this, EventNationalityRUIterator.class);
			pageContext.getOut().print(theEvent.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

