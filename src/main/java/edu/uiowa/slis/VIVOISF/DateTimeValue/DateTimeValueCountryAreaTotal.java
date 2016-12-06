package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCountryAreaTotalIterator theDateTimeValue = (DateTimeValueCountryAreaTotalIterator)findAncestorWithClass(this, DateTimeValueCountryAreaTotalIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

