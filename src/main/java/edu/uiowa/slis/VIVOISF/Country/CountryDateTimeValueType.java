package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryDateTimeValueIterator theCountryDateTimeValueIterator = (CountryDateTimeValueIterator)findAncestorWithClass(this, CountryDateTimeValueIterator.class);
			pageContext.getOut().print(theCountryDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

