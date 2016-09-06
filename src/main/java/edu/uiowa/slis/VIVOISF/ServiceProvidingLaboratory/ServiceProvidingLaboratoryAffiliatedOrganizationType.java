package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryAffiliatedOrganizationIterator theServiceProvidingLaboratoryAffiliatedOrganizationIterator = (ServiceProvidingLaboratoryAffiliatedOrganizationIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

