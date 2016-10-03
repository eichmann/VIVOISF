package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryDirectorInverseIterator theServiceProvidingLaboratoryDirectorInverseIterator = (ServiceProvidingLaboratoryDirectorInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryDirectorInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for director tag ");
		}
		return SKIP_BODY;
	}
}

