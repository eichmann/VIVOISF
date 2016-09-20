package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryOBI_0000304InverseIterator theServiceProvidingLaboratoryOBI_0000304InverseIterator = (ServiceProvidingLaboratoryOBI_0000304InverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

