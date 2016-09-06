package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasCollaboratorIterator theFundingOrganizationHasCollaboratorIterator = (FundingOrganizationHasCollaboratorIterator)findAncestorWithClass(this, FundingOrganizationHasCollaboratorIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

