package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalAgriculturalAreaYearIterator theDateTimeInterval = (DateTimeIntervalAgriculturalAreaYearIterator)findAncestorWithClass(this, DateTimeIntervalAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

