package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalLandAreaYearIterator theDateTimeInterval = (DateTimeIntervalLandAreaYearIterator)findAncestorWithClass(this, DateTimeIntervalLandAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

