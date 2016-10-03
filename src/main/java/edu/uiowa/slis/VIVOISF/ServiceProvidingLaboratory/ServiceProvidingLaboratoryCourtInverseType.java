package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryCourtInverseIterator theServiceProvidingLaboratoryCourtInverseIterator = (ServiceProvidingLaboratoryCourtInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryCourtInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for court tag ");
		}
		return SKIP_BODY;
	}
}

