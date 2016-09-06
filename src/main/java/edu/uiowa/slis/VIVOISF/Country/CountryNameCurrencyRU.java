package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyRUIterator theCountry = (CountryNameCurrencyRUIterator)findAncestorWithClass(this, CountryNameCurrencyRUIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

