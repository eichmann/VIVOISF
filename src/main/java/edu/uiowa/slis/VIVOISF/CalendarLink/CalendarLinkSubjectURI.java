package edu.uiowa.slis.VIVOISF.CalendarLink;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLinkSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLinkSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLinkSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			if (!theCalendarLink.commitNeeded) {
				pageContext.getOut().print(theCalendarLink.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			return theCalendarLink.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CalendarLink for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CalendarLink theCalendarLink = (CalendarLink)findAncestorWithClass(this, CalendarLink.class);
			theCalendarLink.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CalendarLink for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CalendarLink for subjectURI tag ");
		}
	}
}

