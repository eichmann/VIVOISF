package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryPerformerInverseIterator theServiceProvidingLaboratoryPerformerInverseIterator = (ServiceProvidingLaboratoryPerformerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryPerformerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for performer tag ");
		}
		return SKIP_BODY;
	}
}

