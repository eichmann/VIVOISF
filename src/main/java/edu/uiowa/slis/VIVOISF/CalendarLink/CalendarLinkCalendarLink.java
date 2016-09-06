package edu.uiowa.slis.VIVOISF.CalendarLink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLinkCalendarLink extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLinkCalendarLink currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLinkCalendarLink.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CalendarLinkCalendarLinkIterator theCalendarLink = (CalendarLinkCalendarLinkIterator)findAncestorWithClass(this, CalendarLinkCalendarLinkIterator.class);
			pageContext.getOut().print(theCalendarLink.getCalendarLink());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for calendarLink tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for calendarLink tag ");
		}
		return SKIP_BODY;
	}
}

