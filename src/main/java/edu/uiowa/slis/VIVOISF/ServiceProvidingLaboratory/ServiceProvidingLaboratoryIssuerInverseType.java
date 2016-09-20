package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryIssuerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryIssuerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryIssuerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryIssuerInverseIterator theServiceProvidingLaboratoryIssuerInverseIterator = (ServiceProvidingLaboratoryIssuerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryIssuerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryIssuerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for issuer tag ");
		}
		return SKIP_BODY;
	}
}

