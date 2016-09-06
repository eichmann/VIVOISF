package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationAffiliatedOrganizationIterator theFundingOrganizationAffiliatedOrganizationIterator = (FundingOrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, FundingOrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theFundingOrganizationAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

