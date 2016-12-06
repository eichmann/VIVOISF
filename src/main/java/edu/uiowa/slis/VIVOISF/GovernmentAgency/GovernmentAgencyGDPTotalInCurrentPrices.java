package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyGDPTotalInCurrentPricesIterator theGovernmentAgency = (GovernmentAgencyGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, GovernmentAgencyGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theGovernmentAgency.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

