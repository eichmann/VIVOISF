package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyZHIterator theCountry = (CountryNameCurrencyZHIterator)findAncestorWithClass(this, CountryNameCurrencyZHIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

