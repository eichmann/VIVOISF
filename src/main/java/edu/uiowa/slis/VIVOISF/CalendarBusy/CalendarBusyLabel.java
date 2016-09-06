package edu.uiowa.slis.VIVOISF.CalendarBusy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarBusyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarBusyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarBusyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			if (!theCalendarBusy.commitNeeded) {
				pageContext.getOut().print(theCalendarBusy.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			return theCalendarBusy.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarBusy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			theCalendarBusy.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for label tag ");
		}
	}
}

