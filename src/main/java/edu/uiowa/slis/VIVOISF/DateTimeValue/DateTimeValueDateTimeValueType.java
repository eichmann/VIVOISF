package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeValueIterator theDateTimeValueDateTimeValueIterator = (DateTimeValueDateTimeValueIterator)findAncestorWithClass(this, DateTimeValueDateTimeValueIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

