package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialESIterator theDateTimeValue = (DateTimeValueNameOfficialESIterator)findAncestorWithClass(this, DateTimeValueNameOfficialESIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

