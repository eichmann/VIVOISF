package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionMemberInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionMemberInverseIterator theDateTimeValuePrecisionMemberInverseIterator = (DateTimeValuePrecisionMemberInverseIterator)findAncestorWithClass(this, DateTimeValuePrecisionMemberInverseIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for member tag ");
		}
		return SKIP_BODY;
	}
}

