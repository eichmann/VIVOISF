package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceGDPTotalInCurrentPricesIterator theStateOrProvince = (StateOrProvinceGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, StateOrProvinceGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theStateOrProvince.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

