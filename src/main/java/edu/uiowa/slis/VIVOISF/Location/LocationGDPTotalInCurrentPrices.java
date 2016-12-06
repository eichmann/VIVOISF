package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationGDPTotalInCurrentPricesIterator theLocation = (LocationGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, LocationGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theLocation.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

