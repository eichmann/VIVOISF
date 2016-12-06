package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeFAOSTATIterator theDateTimeInterval = (DateTimeIntervalCodeFAOSTATIterator)findAncestorWithClass(this, DateTimeIntervalCodeFAOSTATIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

