package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryRelatedByIterator theServiceProvidingLaboratoryRelatedByIterator = (ServiceProvidingLaboratoryRelatedByIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryRelatedByIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

