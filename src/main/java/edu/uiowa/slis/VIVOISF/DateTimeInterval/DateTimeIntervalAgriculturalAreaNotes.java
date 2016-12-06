package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalAgriculturalAreaNotesIterator theDateTimeInterval = (DateTimeIntervalAgriculturalAreaNotesIterator)findAncestorWithClass(this, DateTimeIntervalAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

