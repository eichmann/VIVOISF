package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationInformationResourceSupportedByIterator theOrganizationInformationResourceSupportedByIterator = (OrganizationInformationResourceSupportedByIterator)findAncestorWithClass(this, OrganizationInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theOrganizationInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

