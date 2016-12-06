package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceGDPTotalInCurrentPricesIterator theConference = (ConferenceGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, ConferenceGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theConference.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

