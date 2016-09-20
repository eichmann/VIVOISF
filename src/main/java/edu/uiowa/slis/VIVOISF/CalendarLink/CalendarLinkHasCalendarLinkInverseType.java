package edu.uiowa.slis.VIVOISF.CalendarLink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLinkHasCalendarLinkInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLinkHasCalendarLinkInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLinkHasCalendarLinkInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CalendarLinkHasCalendarLinkInverseIterator theCalendarLinkHasCalendarLinkInverseIterator = (CalendarLinkHasCalendarLinkInverseIterator)findAncestorWithClass(this, CalendarLinkHasCalendarLinkInverseIterator.class);
			pageContext.getOut().print(theCalendarLinkHasCalendarLinkInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for hasCalendarLink tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for hasCalendarLink tag ");
		}
		return SKIP_BODY;
	}
}

