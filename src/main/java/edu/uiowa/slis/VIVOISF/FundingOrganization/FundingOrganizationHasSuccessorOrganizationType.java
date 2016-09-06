package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasSuccessorOrganizationIterator theFundingOrganizationHasSuccessorOrganizationIterator = (FundingOrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, FundingOrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

