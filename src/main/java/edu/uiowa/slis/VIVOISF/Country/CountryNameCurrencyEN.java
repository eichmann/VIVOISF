package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyENIterator theCountry = (CountryNameCurrencyENIterator)findAncestorWithClass(this, CountryNameCurrencyENIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

