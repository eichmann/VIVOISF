package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalDateTimeIntervalInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalDateTimeIntervalInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalDateTimeIntervalInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalDateTimeIntervalInverseIterator theDateTimeIntervalDateTimeIntervalInverseIterator = (DateTimeIntervalDateTimeIntervalInverseIterator)findAncestorWithClass(this, DateTimeIntervalDateTimeIntervalInverseIterator.class);
			pageContext.getOut().print(theDateTimeIntervalDateTimeIntervalInverseIterator.getDateTimeIntervalInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

