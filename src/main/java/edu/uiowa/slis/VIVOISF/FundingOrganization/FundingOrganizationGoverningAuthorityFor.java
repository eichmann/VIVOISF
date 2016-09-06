package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationGoverningAuthorityFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationGoverningAuthorityFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationGoverningAuthorityFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationGoverningAuthorityForIterator theFundingOrganizationGoverningAuthorityForIterator = (FundingOrganizationGoverningAuthorityForIterator)findAncestorWithClass(this, FundingOrganizationGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theFundingOrganizationGoverningAuthorityForIterator.getGoverningAuthorityFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

