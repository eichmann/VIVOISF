package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCountryAreaYearIterator theDateTimeInterval = (DateTimeIntervalCountryAreaYearIterator)findAncestorWithClass(this, DateTimeIntervalCountryAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

