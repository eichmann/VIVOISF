package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryNameCurrencyARIterator theCountry = (CountryNameCurrencyARIterator)findAncestorWithClass(this, CountryNameCurrencyARIterator.class);
			pageContext.getOut().print(theCountry.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

