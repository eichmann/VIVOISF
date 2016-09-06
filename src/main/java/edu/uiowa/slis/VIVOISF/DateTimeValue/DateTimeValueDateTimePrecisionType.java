package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimePrecisionType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimePrecisionType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimePrecisionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimePrecisionIterator theDateTimeValueDateTimePrecisionIterator = (DateTimeValueDateTimePrecisionIterator)findAncestorWithClass(this, DateTimeValueDateTimePrecisionIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimePrecisionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimePrecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimePrecision tag ");
		}
		return SKIP_BODY;
	}
}

