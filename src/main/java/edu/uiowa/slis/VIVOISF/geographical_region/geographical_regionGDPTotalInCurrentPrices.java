package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionGDPTotalInCurrentPricesIterator thegeographical_region = (geographical_regionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, geographical_regionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thegeographical_region.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

