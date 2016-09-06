package edu.uiowa.slis.VIVOISF.CalendarBusy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarBusySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarBusySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarBusySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			if (!theCalendarBusy.commitNeeded) {
				pageContext.getOut().print(theCalendarBusy.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			return theCalendarBusy.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarBusy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CalendarBusy theCalendarBusy = (CalendarBusy)findAncestorWithClass(this, CalendarBusy.class);
			theCalendarBusy.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarBusy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarBusy for subjectURI tag ");
		}
	}
}

