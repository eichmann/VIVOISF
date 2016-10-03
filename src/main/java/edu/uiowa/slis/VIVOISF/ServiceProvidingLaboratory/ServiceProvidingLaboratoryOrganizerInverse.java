package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryOrganizerInverseIterator theServiceProvidingLaboratoryOrganizerInverseIterator = (ServiceProvidingLaboratoryOrganizerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryOrganizerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for organizer tag ");
		}
		return SKIP_BODY;
	}
}
