package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(EventDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EventDateTimeIntervalIterator theEventDateTimeIntervalIterator = (EventDateTimeIntervalIterator)findAncestorWithClass(this, EventDateTimeIntervalIterator.class);
			pageContext.getOut().print(theEventDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

