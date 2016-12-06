package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueLandAreaNotesIterator theDateTimeValue = (DateTimeValueLandAreaNotesIterator)findAncestorWithClass(this, DateTimeValueLandAreaNotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

