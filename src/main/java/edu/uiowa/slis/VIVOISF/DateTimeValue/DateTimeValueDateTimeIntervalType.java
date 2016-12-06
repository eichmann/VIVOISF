package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeIntervalIterator theDateTimeValueDateTimeIntervalIterator = (DateTimeValueDateTimeIntervalIterator)findAncestorWithClass(this, DateTimeValueDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

