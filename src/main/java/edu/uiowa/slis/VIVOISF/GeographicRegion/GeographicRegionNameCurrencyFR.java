package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyFRIterator theGeographicRegion = (GeographicRegionNameCurrencyFRIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

