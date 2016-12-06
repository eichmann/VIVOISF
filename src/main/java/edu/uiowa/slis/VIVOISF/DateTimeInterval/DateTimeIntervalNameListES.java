package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListESIterator theDateTimeInterval = (DateTimeIntervalNameListESIterator)findAncestorWithClass(this, DateTimeIntervalNameListESIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

