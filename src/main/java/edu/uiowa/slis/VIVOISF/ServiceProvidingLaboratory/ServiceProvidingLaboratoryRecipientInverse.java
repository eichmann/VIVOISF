package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryRecipientInverseIterator theServiceProvidingLaboratoryRecipientInverseIterator = (ServiceProvidingLaboratoryRecipientInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryRecipientInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for recipient tag ");
		}
		return SKIP_BODY;
	}
}

