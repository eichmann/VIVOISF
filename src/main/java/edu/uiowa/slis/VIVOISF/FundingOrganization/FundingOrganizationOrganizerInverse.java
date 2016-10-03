package edu.uiowa.slis.VIVOISF.FundingOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FundingOrganizationOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FundingOrganizationOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FundingOrganizationOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FundingOrganizationOrganizerInverseIterator theFundingOrganizationOrganizerInverseIterator = (FundingOrganizationOrganizerInverseIterator)findAncestorWithClass(this, FundingOrganizationOrganizerInverseIterator.class);
			pageContext.getOut().print(theFundingOrganizationOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing FundingOrganization for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing FundingOrganization for organizer tag ");
		}
		return SKIP_BODY;
	}
}
