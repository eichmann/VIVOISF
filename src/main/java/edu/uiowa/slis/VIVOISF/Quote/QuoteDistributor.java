package edu.uiowa.slis.VIVOISF.Quote;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class QuoteDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static QuoteDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(QuoteDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			QuoteDistributorIterator theQuoteDistributorIterator = (QuoteDistributorIterator)findAncestorWithClass(this, QuoteDistributorIterator.class);
			pageContext.getOut().print(theQuoteDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Quote for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Quote for distributor tag ");
		}
		return SKIP_BODY;
	}
}

