package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingGDPTotalInCurrentPricesIterator theThing = (ThingGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ThingGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theThing.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

