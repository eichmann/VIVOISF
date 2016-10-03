package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratorySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratorySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratorySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratorySuffixNameIterator theServiceProvidingLaboratory = (ServiceProvidingLaboratorySuffixNameIterator)findAncestorWithClass(this, ServiceProvidingLaboratorySuffixNameIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratory.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

