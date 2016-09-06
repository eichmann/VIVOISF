package edu.uiowa.slis.VIVOISF.CalendarBusy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarBusyCalendarBusy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarBusyCalendarBusy currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarBusyCalendarBusy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CalendarBusyCalendarBusyIterator theCalendarBusy = (CalendarBusyCalendarBusyIterator)findAncestorWithClass(this, CalendarBusyCalendarBusyIterator.class);
			pageContext.getOut().print(theCalendarBusy.getCalendarBusy());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for calendarBusy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for calendarBusy tag ");
		}
		return SKIP_BODY;
	}
}

