package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionGDPTotalInCurrentPricesIterator theeconomic_region = (economic_regionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, economic_regionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theeconomic_region.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

