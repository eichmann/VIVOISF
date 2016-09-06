package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyFRIterator theCountry = (CountryNameCurrencyFRIterator)findAncestorWithClass(this, CountryNameCurrencyFRIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

