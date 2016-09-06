package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryPublisherOfIterator theServiceProvidingLaboratoryPublisherOfIterator = (ServiceProvidingLaboratoryPublisherOfIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryPublisherOfIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

