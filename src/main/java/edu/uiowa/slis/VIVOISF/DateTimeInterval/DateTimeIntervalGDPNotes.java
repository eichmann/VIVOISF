package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalGDPNotesIterator theDateTimeInterval = (DateTimeIntervalGDPNotesIterator)findAncestorWithClass(this, DateTimeIntervalGDPNotesIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

