package edu.uiowa.slis.VIVOISF.CalendarBusy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarBusyHasCalenderBusyInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarBusyHasCalenderBusyInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarBusyHasCalenderBusyInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CalendarBusyHasCalenderBusyInverseIterator theCalendarBusyHasCalenderBusyInverseIterator = (CalendarBusyHasCalenderBusyInverseIterator)findAncestorWithClass(this, CalendarBusyHasCalenderBusyInverseIterator.class);
			pageContext.getOut().print(theCalendarBusyHasCalenderBusyInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for hasCalenderBusy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for hasCalenderBusy tag ");
		}
		return SKIP_BODY;
	}
}

