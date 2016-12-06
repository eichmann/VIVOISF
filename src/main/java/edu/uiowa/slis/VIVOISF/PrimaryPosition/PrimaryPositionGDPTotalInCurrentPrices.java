package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionGDPTotalInCurrentPricesIterator thePrimaryPosition = (PrimaryPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PrimaryPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

