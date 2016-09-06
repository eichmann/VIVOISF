package edu.uiowa.slis.VIVOISF.CalendarRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarRequestCalendarRequest extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarRequestCalendarRequest currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarRequestCalendarRequest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CalendarRequestCalendarRequestIterator theCalendarRequest = (CalendarRequestCalendarRequestIterator)findAncestorWithClass(this, CalendarRequestCalendarRequestIterator.class);
			pageContext.getOut().print(theCalendarRequest.getCalendarRequest());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for calendarRequest tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for calendarRequest tag ");
		}
		return SKIP_BODY;
	}
}

