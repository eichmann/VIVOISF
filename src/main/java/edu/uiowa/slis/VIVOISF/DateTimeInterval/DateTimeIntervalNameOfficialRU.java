package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameOfficialRUIterator theDateTimeInterval = (DateTimeIntervalNameOfficialRUIterator)findAncestorWithClass(this, DateTimeIntervalNameOfficialRUIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

