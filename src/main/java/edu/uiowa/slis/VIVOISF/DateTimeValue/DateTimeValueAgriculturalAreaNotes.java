package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueAgriculturalAreaNotesIterator theDateTimeValue = (DateTimeValueAgriculturalAreaNotesIterator)findAncestorWithClass(this, DateTimeValueAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

