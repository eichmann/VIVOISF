package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryHasSuccessorOrganizationIterator theServiceProvidingLaboratoryHasSuccessorOrganizationIterator = (ServiceProvidingLaboratoryHasSuccessorOrganizationIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

