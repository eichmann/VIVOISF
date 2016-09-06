package edu.uiowa.slis.VIVOISF.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CalendarLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CalendarLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CalendarLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			if (!theCalendar.commitNeeded) {
				pageContext.getOut().print(theCalendar.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Calendar for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			return theCalendar.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Calendar for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Calendar theCalendar = (Calendar)findAncestorWithClass(this, Calendar.class);
			theCalendar.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Calendar for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Calendar for label tag ");
		}
	}
}

