package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyITIterator theCountry = (CountryNameCurrencyITIterator)findAncestorWithClass(this, CountryNameCurrencyITIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

