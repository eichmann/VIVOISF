package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeFAOSTATIterator theDateTimeValue = (DateTimeValueCodeFAOSTATIterator)findAncestorWithClass(this, DateTimeValueCodeFAOSTATIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

