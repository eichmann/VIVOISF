package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCountryAreaYearIterator theDateTimeValue = (DateTimeValueCountryAreaYearIterator)findAncestorWithClass(this, DateTimeValueCountryAreaYearIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

