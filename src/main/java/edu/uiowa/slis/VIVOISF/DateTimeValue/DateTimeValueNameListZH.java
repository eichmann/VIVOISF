package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueNameListZHIterator theDateTimeValue = (DateTimeValueNameListZHIterator)findAncestorWithClass(this, DateTimeValueNameListZHIterator.class);
			pageContext.getOut().print(theDateTimeValue.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

