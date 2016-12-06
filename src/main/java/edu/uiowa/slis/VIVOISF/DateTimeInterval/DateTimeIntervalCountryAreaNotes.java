package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCountryAreaNotesIterator theDateTimeInterval = (DateTimeIntervalCountryAreaNotesIterator)findAncestorWithClass(this, DateTimeIntervalCountryAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

