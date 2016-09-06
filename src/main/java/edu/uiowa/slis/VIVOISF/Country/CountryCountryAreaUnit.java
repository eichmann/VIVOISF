package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCountryAreaUnitIterator theCountry = (CountryCountryAreaUnitIterator)findAncestorWithClass(this, CountryCountryAreaUnitIterator.class);
			pageContext.getOut().print(theCountry.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

