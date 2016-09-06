package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimePrecision extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimePrecision currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimePrecision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimePrecisionIterator theDateTimeValueDateTimePrecisionIterator = (DateTimeValueDateTimePrecisionIterator)findAncestorWithClass(this, DateTimeValueDateTimePrecisionIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimePrecisionIterator.getDateTimePrecision());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimePrecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimePrecision tag ");
		}
		return SKIP_BODY;
	}
}

