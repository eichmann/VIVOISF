package edu.uiowa.slis.VIVOISF.CalendarLink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLinkHasCalendarLinkInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLinkHasCalendarLinkInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLinkHasCalendarLinkInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CalendarLinkHasCalendarLinkInverseIterator theCalendarLinkHasCalendarLinkInverseIterator = (CalendarLinkHasCalendarLinkInverseIterator)findAncestorWithClass(this, CalendarLinkHasCalendarLinkInverseIterator.class);
			pageContext.getOut().print(theCalendarLinkHasCalendarLinkInverseIterator.getHasCalendarLinkInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for hasCalendarLink tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for hasCalendarLink tag ");
		}
		return SKIP_BODY;
	}
}

