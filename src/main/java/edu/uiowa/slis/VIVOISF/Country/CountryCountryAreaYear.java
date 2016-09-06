package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCountryAreaYearIterator theCountry = (CountryCountryAreaYearIterator)findAncestorWithClass(this, CountryCountryAreaYearIterator.class);
			pageContext.getOut().print(theCountry.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

