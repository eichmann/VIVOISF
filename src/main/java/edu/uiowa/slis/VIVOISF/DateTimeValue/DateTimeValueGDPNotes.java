package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueGDPNotesIterator theDateTimeValue = (DateTimeValueGDPNotesIterator)findAncestorWithClass(this, DateTimeValueGDPNotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

