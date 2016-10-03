package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationOwnerInverseIterator theFundingOrganizationOwnerInverseIterator = (FundingOrganizationOwnerInverseIterator)findAncestorWithClass(this, FundingOrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for owner tag ");
		}
		return SKIP_BODY;
	}
}

