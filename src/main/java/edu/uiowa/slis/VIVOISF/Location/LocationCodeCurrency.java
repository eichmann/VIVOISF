package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeCurrencyIterator theLocation = (LocationCodeCurrencyIterator)findAncestorWithClass(this, LocationCodeCurrencyIterator.class);
			pageContext.getOut().print(theLocation.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

