package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryGDPTotalInCurrentPricesIterator theterritory = (territoryGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, territoryGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theterritory.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

