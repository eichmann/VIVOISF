package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeISO3Iterator theDateTimeInterval = (DateTimeIntervalCodeISO3Iterator)findAncestorWithClass(this, DateTimeIntervalCodeISO3Iterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

