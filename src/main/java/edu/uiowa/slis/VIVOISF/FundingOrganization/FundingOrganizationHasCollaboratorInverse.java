package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationHasCollaboratorInverseIterator theFundingOrganizationHasCollaboratorInverseIterator = (FundingOrganizationHasCollaboratorInverseIterator)findAncestorWithClass(this, FundingOrganizationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

