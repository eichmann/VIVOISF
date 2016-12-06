package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(areaGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaGDPTotalInCurrentPricesIterator thearea = (areaGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, areaGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thearea.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing area for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

