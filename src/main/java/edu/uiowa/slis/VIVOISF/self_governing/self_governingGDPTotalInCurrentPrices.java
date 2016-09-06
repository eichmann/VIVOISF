package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingGDPTotalInCurrentPricesIterator theself_governing = (self_governingGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, self_governingGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theself_governing.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

