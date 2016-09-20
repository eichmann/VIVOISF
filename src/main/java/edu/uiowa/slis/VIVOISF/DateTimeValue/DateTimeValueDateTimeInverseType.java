package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueDateTimeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueDateTimeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueDateTimeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueDateTimeInverseIterator theDateTimeValueDateTimeInverseIterator = (DateTimeValueDateTimeInverseIterator)findAncestorWithClass(this, DateTimeValueDateTimeInverseIterator.class);
			pageContext.getOut().print(theDateTimeValueDateTimeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for dateTime tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for dateTime tag ");
		}
		return SKIP_BODY;
	}
}

