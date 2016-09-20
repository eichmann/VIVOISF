package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryIssuerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryIssuerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryIssuerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryIssuerInverseIterator theServiceProvidingLaboratoryIssuerInverseIterator = (ServiceProvidingLaboratoryIssuerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryIssuerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryIssuerInverseIterator.getIssuerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for issuer tag ");
		}
		return SKIP_BODY;
	}
}

