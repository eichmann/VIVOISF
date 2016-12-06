package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalDateTimeValueIterator theDateTimeIntervalDateTimeValueIterator = (DateTimeIntervalDateTimeValueIterator)findAncestorWithClass(this, DateTimeIntervalDateTimeValueIterator.class);
			pageContext.getOut().print(theDateTimeIntervalDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

