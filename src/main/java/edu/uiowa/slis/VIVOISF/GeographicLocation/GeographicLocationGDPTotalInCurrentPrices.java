package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationGDPTotalInCurrentPricesIterator theGeographicLocation = (GeographicLocationGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, GeographicLocationGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theGeographicLocation.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

