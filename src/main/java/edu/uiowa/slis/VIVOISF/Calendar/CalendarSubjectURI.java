package edu.uiowa.slis.VIVOISF.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			if (!theCalendar.commitNeeded) {
				pageContext.getOut().print(theCalendar.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Calendar for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			return theCalendar.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Calendar for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			theCalendar.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Calendar for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for subjectURI tag ");
		}
	}
}

