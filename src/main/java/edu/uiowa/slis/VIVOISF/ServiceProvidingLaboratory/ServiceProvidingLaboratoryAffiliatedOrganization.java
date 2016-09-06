package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryAffiliatedOrganizationIterator theServiceProvidingLaboratoryAffiliatedOrganizationIterator = (ServiceProvidingLaboratoryAffiliatedOrganizationIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

