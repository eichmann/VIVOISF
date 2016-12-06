package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListRUIterator theDateTimeInterval = (DateTimeIntervalNameListRUIterator)findAncestorWithClass(this, DateTimeIntervalNameListRUIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

