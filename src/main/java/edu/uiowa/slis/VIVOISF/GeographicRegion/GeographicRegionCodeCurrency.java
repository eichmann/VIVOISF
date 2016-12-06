package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionCodeCurrencyIterator theGeographicRegion = (GeographicRegionCodeCurrencyIterator)findAncestorWithClass(this, GeographicRegionCodeCurrencyIterator.class);
			pageContext.getOut().print(theGeographicRegion.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

