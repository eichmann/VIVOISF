package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryHasCollaboratorInverseIterator theServiceProvidingLaboratoryHasCollaboratorInverseIterator = (ServiceProvidingLaboratoryHasCollaboratorInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

