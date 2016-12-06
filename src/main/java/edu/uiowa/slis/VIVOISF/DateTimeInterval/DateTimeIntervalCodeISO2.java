package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeISO2Iterator theDateTimeInterval = (DateTimeIntervalCodeISO2Iterator)findAncestorWithClass(this, DateTimeIntervalCodeISO2Iterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

