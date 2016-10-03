package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryProducerInverseIterator theServiceProvidingLaboratoryProducerInverseIterator = (ServiceProvidingLaboratoryProducerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryProducerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for producer tag ");
		}
		return SKIP_BODY;
	}
}

