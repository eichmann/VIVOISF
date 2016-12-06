package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameOfficialRUIterator theDateTimeValue = (DateTimeValueNameOfficialRUIterator)findAncestorWithClass(this, DateTimeValueNameOfficialRUIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

