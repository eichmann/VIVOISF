package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationGDPTotalInCurrentPricesIterator theOrganization = (OrganizationGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, OrganizationGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theOrganization.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

