package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryPrefixNameIterator theServiceProvidingLaboratory = (ServiceProvidingLaboratoryPrefixNameIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryPrefixNameIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratory.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

