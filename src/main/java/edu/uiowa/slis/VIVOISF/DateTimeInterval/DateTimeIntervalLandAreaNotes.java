package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalLandAreaNotesIterator theDateTimeInterval = (DateTimeIntervalLandAreaNotesIterator)findAncestorWithClass(this, DateTimeIntervalLandAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

