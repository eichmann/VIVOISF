package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHDINotesIterator theDateTimeInterval = (DateTimeIntervalHDINotesIterator)findAncestorWithClass(this, DateTimeIntervalHDINotesIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

