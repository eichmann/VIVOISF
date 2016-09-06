package edu.uiowa.slis.VIVOISF.CalendarRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarRequestSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarRequestSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarRequestSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			if (!theCalendarRequest.commitNeeded) {
				pageContext.getOut().print(theCalendarRequest.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			return theCalendarRequest.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarRequest for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CalendarRequest theCalendarRequest = (CalendarRequest)findAncestorWithClass(this, CalendarRequest.class);
			theCalendarRequest.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarRequest for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarRequest for subjectURI tag ");
		}
	}
}

