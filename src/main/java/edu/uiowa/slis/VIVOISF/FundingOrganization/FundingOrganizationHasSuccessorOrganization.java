package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasSuccessorOrganizationIterator theFundingOrganizationHasSuccessorOrganizationIterator = (FundingOrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, FundingOrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

