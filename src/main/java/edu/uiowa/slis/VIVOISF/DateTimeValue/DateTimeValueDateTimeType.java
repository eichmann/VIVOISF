package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeIterator theDateTimeValueDateTimeIterator = (DateTimeValueDateTimeIterator)findAncestorWithClass(this, DateTimeValueDateTimeIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTime tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTime tag ");
		}
		return SKIP_BODY;
	}
}

