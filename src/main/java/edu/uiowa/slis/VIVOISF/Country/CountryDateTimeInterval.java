package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryDateTimeIntervalIterator theCountryDateTimeIntervalIterator = (CountryDateTimeIntervalIterator)findAncestorWithClass(this, CountryDateTimeIntervalIterator.class);
			pageContext.getOut().print(theCountryDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

