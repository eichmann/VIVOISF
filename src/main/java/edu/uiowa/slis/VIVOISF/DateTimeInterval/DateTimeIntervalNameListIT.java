package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameListITIterator theDateTimeInterval = (DateTimeIntervalNameListITIterator)findAncestorWithClass(this, DateTimeIntervalNameListITIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

