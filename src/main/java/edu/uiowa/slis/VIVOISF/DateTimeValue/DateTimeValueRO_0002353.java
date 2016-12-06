package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRO_0002353Iterator theDateTimeValueRO_0002353Iterator = (DateTimeValueRO_0002353Iterator)findAncestorWithClass(this, DateTimeValueRO_0002353Iterator.class);
			pageContext.getOut().print(theDateTimeValueRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

