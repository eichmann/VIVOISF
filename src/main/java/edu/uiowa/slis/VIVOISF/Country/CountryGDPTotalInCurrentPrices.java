package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryGDPTotalInCurrentPricesIterator theCountry = (CountryGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, CountryGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theCountry.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

