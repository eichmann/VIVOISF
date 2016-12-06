package edu.uiowa.slis.VIVOISF.Event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EventGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EventGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(EventGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EventGDPTotalInCurrentPricesIterator theEvent = (EventGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, EventGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theEvent.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Event for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Event for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

