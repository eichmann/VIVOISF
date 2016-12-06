package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalNameShortZHIterator theDateTimeInterval = (DateTimeIntervalNameShortZHIterator)findAncestorWithClass(this, DateTimeIntervalNameShortZHIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

