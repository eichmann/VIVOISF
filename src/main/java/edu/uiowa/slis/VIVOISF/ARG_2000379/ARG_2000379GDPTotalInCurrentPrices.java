package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379GDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379GDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379GDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379GDPTotalInCurrentPricesIterator theARG_2000379 = (ARG_2000379GDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ARG_2000379GDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theARG_2000379.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

