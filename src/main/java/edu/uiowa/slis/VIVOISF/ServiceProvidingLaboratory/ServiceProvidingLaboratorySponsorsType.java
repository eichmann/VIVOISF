package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratorySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratorySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratorySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratorySponsorsIterator theServiceProvidingLaboratorySponsorsIterator = (ServiceProvidingLaboratorySponsorsIterator)findAncestorWithClass(this, ServiceProvidingLaboratorySponsorsIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratorySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

