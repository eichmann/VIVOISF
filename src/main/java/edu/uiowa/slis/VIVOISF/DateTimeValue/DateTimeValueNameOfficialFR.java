package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialFRIterator theDateTimeValue = (DateTimeValueNameOfficialFRIterator)findAncestorWithClass(this, DateTimeValueNameOfficialFRIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

