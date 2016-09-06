package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeCurrencyIterator theCountry = (CountryCodeCurrencyIterator)findAncestorWithClass(this, CountryCodeCurrencyIterator.class);
			pageContext.getOut().print(theCountry.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

