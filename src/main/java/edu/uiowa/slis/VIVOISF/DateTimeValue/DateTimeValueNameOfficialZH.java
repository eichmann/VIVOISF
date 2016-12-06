package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialZHIterator theDateTimeValue = (DateTimeValueNameOfficialZHIterator)findAncestorWithClass(this, DateTimeValueNameOfficialZHIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

