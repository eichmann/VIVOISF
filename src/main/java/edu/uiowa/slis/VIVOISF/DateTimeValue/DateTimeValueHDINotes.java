package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueHDINotesIterator theDateTimeValue = (DateTimeValueHDINotesIterator)findAncestorWithClass(this, DateTimeValueHDINotesIterator.class);
			pageContext.getOut().print(theDateTimeValue.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

