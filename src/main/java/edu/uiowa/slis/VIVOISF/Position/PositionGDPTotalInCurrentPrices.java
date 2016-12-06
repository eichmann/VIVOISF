package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionGDPTotalInCurrentPricesIterator thePosition = (PositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

