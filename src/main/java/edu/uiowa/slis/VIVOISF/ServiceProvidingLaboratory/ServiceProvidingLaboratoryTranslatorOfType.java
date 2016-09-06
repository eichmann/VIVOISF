package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryTranslatorOfIterator theServiceProvidingLaboratoryTranslatorOfIterator = (ServiceProvidingLaboratoryTranslatorOfIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryTranslatorOfIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

