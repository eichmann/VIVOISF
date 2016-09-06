package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationAffiliatedOrganizationIterator theFundingOrganizationAffiliatedOrganizationIterator = (FundingOrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, FundingOrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theFundingOrganizationAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

