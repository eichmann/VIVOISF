package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeValueInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeValueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeValueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeValueInverseIterator theDateTimeValueDateTimeValueInverseIterator = (DateTimeValueDateTimeValueInverseIterator)findAncestorWithClass(this, DateTimeValueDateTimeValueInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeValueInverseIterator.getDateTimeValueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

