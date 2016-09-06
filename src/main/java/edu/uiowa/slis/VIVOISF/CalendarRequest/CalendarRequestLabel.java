package edu.uiowa.slis.VIVOISF.CalendarRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarRequestLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarRequestLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarRequestLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			if (!theCalendarRequest.commitNeeded) {
				pageContext.getOut().print(theCalendarRequest.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			return theCalendarRequest.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarRequest for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			theCalendarRequest.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for label tag ");
		}
	}
}

