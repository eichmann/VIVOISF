package edu.uiowa.slis.VIVOISF.DateTimeValuePrecision;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValuePrecisionMemberInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValuePrecisionMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValuePrecisionMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValuePrecisionMemberInverseIterator theDateTimeValuePrecisionMemberInverseIterator = (DateTimeValuePrecisionMemberInverseIterator)findAncestorWithClass(this, DateTimeValuePrecisionMemberInverseIterator.class);
			pageContext.getOut().print(theDateTimeValuePrecisionMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValuePrecision for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValuePrecision for member tag ");
		}
		return SKIP_BODY;
	}
}

