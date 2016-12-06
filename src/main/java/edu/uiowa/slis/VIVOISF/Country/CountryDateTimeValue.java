package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryDateTimeValueIterator theCountryDateTimeValueIterator = (CountryDateTimeValueIterator)findAncestorWithClass(this, CountryDateTimeValueIterator.class);
			pageContext.getOut().print(theCountryDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

