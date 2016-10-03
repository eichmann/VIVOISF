package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationCourtInverseIterator theFundingOrganizationCourtInverseIterator = (FundingOrganizationCourtInverseIterator)findAncestorWithClass(this, FundingOrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for court tag ");
		}
		return SKIP_BODY;
	}
}

