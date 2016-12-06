package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCountryAreaUnitIterator theDateTimeInterval = (DateTimeIntervalCountryAreaUnitIterator)findAncestorWithClass(this, DateTimeIntervalCountryAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

