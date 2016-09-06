package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryHasPredecessorOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryHasPredecessorOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryHasPredecessorOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryHasPredecessorOrganizationIterator theServiceProvidingLaboratoryHasPredecessorOrganizationIterator = (ServiceProvidingLaboratoryHasPredecessorOrganizationIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryHasPredecessorOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

