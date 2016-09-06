package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationSubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationSubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationSubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationSubcontractsGrantIterator theFundingOrganizationSubcontractsGrantIterator = (FundingOrganizationSubcontractsGrantIterator)findAncestorWithClass(this, FundingOrganizationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theFundingOrganizationSubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

