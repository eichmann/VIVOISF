package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationOBI_0000304InverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationOBI_0000304InverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationOBI_0000304InverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationOBI_0000304InverseIterator theFundingOrganizationOBI_0000304InverseIterator = (FundingOrganizationOBI_0000304InverseIterator)findAncestorWithClass(this, FundingOrganizationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationOBI_0000304InverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

