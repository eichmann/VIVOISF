package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(EventNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventNationalityESIterator theEvent = (EventNationalityESIterator)findAncestorWithClass(this, EventNationalityESIterator.class);
			pageContext.getOut().print(theEvent.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

