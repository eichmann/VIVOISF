package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryAffiliatedOrganizationInverseIterator theServiceProvidingLaboratoryAffiliatedOrganizationInverseIterator = (ServiceProvidingLaboratoryAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

