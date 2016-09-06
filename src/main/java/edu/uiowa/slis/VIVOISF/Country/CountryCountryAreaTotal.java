package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCountryAreaTotalIterator theCountry = (CountryCountryAreaTotalIterator)findAncestorWithClass(this, CountryCountryAreaTotalIterator.class);
			pageContext.getOut().print(theCountry.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

