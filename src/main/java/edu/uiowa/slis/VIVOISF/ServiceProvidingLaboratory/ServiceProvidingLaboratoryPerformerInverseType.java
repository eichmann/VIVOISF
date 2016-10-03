package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryPerformerInverseIterator theServiceProvidingLaboratoryPerformerInverseIterator = (ServiceProvidingLaboratoryPerformerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryPerformerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for performer tag ");
		}
		return SKIP_BODY;
	}
}

