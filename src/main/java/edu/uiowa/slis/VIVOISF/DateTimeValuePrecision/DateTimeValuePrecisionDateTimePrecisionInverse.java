package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionDateTimePrecisionInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionDateTimePrecisionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionDateTimePrecisionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionDateTimePrecisionInverseIterator theDateTimeValuePrecisionDateTimePrecisionInverseIterator = (DateTimeValuePrecisionDateTimePrecisionInverseIterator)findAncestorWithClass(this, DateTimeValuePrecisionDateTimePrecisionInverseIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionDateTimePrecisionInverseIterator.getDateTimePrecisionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for dateTimePrecision tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for dateTimePrecision tag ");
		}
		return SKIP_BODY;
	}
}

