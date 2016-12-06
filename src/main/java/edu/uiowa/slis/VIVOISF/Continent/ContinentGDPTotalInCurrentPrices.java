package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentGDPTotalInCurrentPricesIterator theContinent = (ContinentGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ContinentGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theContinent.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

