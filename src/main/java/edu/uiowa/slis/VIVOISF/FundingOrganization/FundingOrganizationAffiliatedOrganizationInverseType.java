package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationAffiliatedOrganizationInverseIterator theFundingOrganizationAffiliatedOrganizationInverseIterator = (FundingOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, FundingOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

