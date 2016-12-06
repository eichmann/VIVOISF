package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalHDIYearIterator theDateTimeInterval = (DateTimeIntervalHDIYearIterator)findAncestorWithClass(this, DateTimeIntervalHDIYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

