package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalGDPYearIterator theDateTimeInterval = (DateTimeIntervalGDPYearIterator)findAncestorWithClass(this, DateTimeIntervalGDPYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

