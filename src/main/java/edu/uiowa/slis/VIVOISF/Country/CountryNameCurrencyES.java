package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyESIterator theCountry = (CountryNameCurrencyESIterator)findAncestorWithClass(this, CountryNameCurrencyESIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

