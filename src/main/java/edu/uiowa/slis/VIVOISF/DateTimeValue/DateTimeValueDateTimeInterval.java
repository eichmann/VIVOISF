package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeIntervalIterator theDateTimeValueDateTimeIntervalIterator = (DateTimeValueDateTimeIntervalIterator)findAncestorWithClass(this, DateTimeValueDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

