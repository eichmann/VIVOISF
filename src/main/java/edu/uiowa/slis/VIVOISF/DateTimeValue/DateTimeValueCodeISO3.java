package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeISO3Iterator theDateTimeValue = (DateTimeValueCodeISO3Iterator)findAncestorWithClass(this, DateTimeValueCodeISO3Iterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

