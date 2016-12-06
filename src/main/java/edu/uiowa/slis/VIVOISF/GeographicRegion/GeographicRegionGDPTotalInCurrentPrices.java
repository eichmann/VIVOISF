package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionGDPTotalInCurrentPricesIterator theGeographicRegion = (GeographicRegionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, GeographicRegionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theGeographicRegion.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

