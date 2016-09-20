package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationAffiliatedOrganizationInverseIterator theFundingOrganizationAffiliatedOrganizationInverseIterator = (FundingOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, FundingOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

