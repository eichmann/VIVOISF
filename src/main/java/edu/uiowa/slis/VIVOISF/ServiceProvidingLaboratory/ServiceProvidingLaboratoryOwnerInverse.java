package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryOwnerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryOwnerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryOwnerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryOwnerInverseIterator theServiceProvidingLaboratoryOwnerInverseIterator = (ServiceProvidingLaboratoryOwnerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryOwnerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryOwnerInverseIterator.getOwnerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for owner tag ");
		}
		return SKIP_BODY;
	}
}

