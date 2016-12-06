package edu.uiowa.slis.VIVOISF.Periodical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PeriodicalGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PeriodicalGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PeriodicalGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PeriodicalGDPTotalInCurrentPricesIterator thePeriodical = (PeriodicalGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PeriodicalGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePeriodical.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Periodical for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Periodical for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

