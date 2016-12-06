package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PublisherGDPTotalInCurrentPricesIterator thePublisher = (PublisherGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, PublisherGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(thePublisher.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

