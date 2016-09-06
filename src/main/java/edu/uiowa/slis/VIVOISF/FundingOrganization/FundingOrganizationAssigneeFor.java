package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationAssigneeForIterator theFundingOrganizationAssigneeForIterator = (FundingOrganizationAssigneeForIterator)findAncestorWithClass(this, FundingOrganizationAssigneeForIterator.class);
			pageContext.getOut().print(theFundingOrganizationAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

