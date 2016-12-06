package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortRUIterator theDateTimeInterval = (DateTimeIntervalNameShortRUIterator)findAncestorWithClass(this, DateTimeIntervalNameShortRUIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

