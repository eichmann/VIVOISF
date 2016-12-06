package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCountryAreaTotalIterator theDateTimeInterval = (DateTimeIntervalCountryAreaTotalIterator)findAncestorWithClass(this, DateTimeIntervalCountryAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

