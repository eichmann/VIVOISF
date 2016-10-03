package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryCourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryCourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryCourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryCourtInverseIterator theServiceProvidingLaboratoryCourtInverseIterator = (ServiceProvidingLaboratoryCourtInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryCourtInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryCourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for court tag ");
		}
		return SKIP_BODY;
	}
}

