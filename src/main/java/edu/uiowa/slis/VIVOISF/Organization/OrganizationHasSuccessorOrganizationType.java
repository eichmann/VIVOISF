package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasSuccessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasSuccessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasSuccessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasSuccessorOrganizationIterator theOrganizationHasSuccessorOrganizationIterator = (OrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, OrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theOrganizationHasSuccessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

