package edu.uiowa.slis.VIVOISF.CalendarRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarRequestHasCalendarRequestInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarRequestHasCalendarRequestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarRequestHasCalendarRequestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CalendarRequestHasCalendarRequestInverseIterator theCalendarRequestHasCalendarRequestInverseIterator = (CalendarRequestHasCalendarRequestInverseIterator)findAncestorWithClass(this, CalendarRequestHasCalendarRequestInverseIterator.class);
			pageContext.getOut().print(theCalendarRequestHasCalendarRequestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for hasCalendarRequest tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for hasCalendarRequest tag ");
		}
		return SKIP_BODY;
	}
}

