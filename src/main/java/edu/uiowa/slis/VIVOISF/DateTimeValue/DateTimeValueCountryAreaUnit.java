package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCountryAreaUnitIterator theDateTimeValue = (DateTimeValueCountryAreaUnitIterator)findAncestorWithClass(this, DateTimeValueCountryAreaUnitIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

