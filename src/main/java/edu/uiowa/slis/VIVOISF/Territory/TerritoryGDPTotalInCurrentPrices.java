package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryGDPTotalInCurrentPricesIterator theTerritory = (TerritoryGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, TerritoryGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theTerritory.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

