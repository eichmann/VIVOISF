package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratorySubcontractsGrant extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratorySubcontractsGrant currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratorySubcontractsGrant.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratorySubcontractsGrantIterator theServiceProvidingLaboratorySubcontractsGrantIterator = (ServiceProvidingLaboratorySubcontractsGrantIterator)findAncestorWithClass(this, ServiceProvidingLaboratorySubcontractsGrantIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratorySubcontractsGrantIterator.getSubcontractsGrant());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

