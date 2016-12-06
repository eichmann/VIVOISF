package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueRO_0001025Iterator theDateTimeValueRO_0001025Iterator = (DateTimeValueRO_0001025Iterator)findAncestorWithClass(this, DateTimeValueRO_0001025Iterator.class);
			pageContext.getOut().print(theDateTimeValueRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

