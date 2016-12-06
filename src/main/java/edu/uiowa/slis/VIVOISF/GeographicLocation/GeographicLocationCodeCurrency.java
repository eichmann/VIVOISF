package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationCodeCurrencyIterator theGeographicLocation = (GeographicLocationCodeCurrencyIterator)findAncestorWithClass(this, GeographicLocationCodeCurrencyIterator.class);
			pageContext.getOut().print(theGeographicLocation.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

