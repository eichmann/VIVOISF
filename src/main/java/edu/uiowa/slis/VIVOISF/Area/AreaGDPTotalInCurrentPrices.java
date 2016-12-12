package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaGDPTotalInCurrentPricesIterator theArea = (AreaGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, AreaGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theArea.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

