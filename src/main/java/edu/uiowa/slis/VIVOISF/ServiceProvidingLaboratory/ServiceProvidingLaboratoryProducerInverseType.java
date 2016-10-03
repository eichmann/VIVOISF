package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryProducerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryProducerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryProducerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryProducerInverseIterator theServiceProvidingLaboratoryProducerInverseIterator = (ServiceProvidingLaboratoryProducerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryProducerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryProducerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for producer tag ");
		}
		return SKIP_BODY;
	}
}

