package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationSuffixNameIterator theFundingOrganization = (FundingOrganizationSuffixNameIterator)findAncestorWithClass(this, FundingOrganizationSuffixNameIterator.class);
			pageContext.getOut().print(theFundingOrganization.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

