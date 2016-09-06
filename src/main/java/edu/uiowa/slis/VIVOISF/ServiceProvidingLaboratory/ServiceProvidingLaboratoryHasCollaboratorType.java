package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryHasCollaboratorIterator theServiceProvidingLaboratoryHasCollaboratorIterator = (ServiceProvidingLaboratoryHasCollaboratorIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryHasCollaboratorIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

