package edu.uiowa.slis.VIVOISF.CalendarLink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLinkLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLinkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLinkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			if (!theCalendarLink.commitNeeded) {
				pageContext.getOut().print(theCalendarLink.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			return theCalendarLink.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarLink for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			theCalendarLink.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for label tag ");
		}
	}
}

