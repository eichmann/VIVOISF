package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryGoverningAuthorityForIterator theServiceProvidingLaboratoryGoverningAuthorityForIterator = (ServiceProvidingLaboratoryGoverningAuthorityForIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

