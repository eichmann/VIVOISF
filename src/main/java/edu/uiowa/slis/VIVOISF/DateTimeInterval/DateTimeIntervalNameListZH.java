package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListZHIterator theDateTimeInterval = (DateTimeIntervalNameListZHIterator)findAncestorWithClass(this, DateTimeIntervalNameListZHIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

