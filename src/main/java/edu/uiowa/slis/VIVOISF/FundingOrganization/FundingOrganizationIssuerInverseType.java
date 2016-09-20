package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationIssuerInverseIterator theFundingOrganizationIssuerInverseIterator = (FundingOrganizationIssuerInverseIterator)findAncestorWithClass(this, FundingOrganizationIssuerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for issuer tag ");
		}
		return SKIP_BODY;
	}
}

