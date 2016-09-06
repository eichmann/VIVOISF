package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasSuccessorOrganizationIterator theGovernmentAgencyHasSuccessorOrganizationIterator = (GovernmentAgencyHasSuccessorOrganizationIterator)findAncestorWithClass(this, GovernmentAgencyHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

