package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalDateTimeIntervalIterator theDateTimeIntervalDateTimeIntervalIterator = (DateTimeIntervalDateTimeIntervalIterator)findAncestorWithClass(this, DateTimeIntervalDateTimeIntervalIterator.class);
			pageContext.getOut().print(theDateTimeIntervalDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

