package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRO_0000057Iterator theDateTimeValueRO_0000057Iterator = (DateTimeValueRO_0000057Iterator)findAncestorWithClass(this, DateTimeValueRO_0000057Iterator.class);
			pageContext.getOut().print(theDateTimeValueRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

