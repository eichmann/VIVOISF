package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationPrefixNameIterator theFundingOrganization = (FundingOrganizationPrefixNameIterator)findAncestorWithClass(this, FundingOrganizationPrefixNameIterator.class);
			pageContext.getOut().print(theFundingOrganization.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

