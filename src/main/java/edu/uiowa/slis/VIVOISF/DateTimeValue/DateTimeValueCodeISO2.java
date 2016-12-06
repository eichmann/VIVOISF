package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeISO2Iterator theDateTimeValue = (DateTimeValueCodeISO2Iterator)findAncestorWithClass(this, DateTimeValueCodeISO2Iterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

