package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCountryAreaNotesIterator theDateTimeValue = (DateTimeValueCountryAreaNotesIterator)findAncestorWithClass(this, DateTimeValueCountryAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

