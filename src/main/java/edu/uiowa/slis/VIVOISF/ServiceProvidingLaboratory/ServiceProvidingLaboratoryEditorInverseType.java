package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryEditorInverseIterator theServiceProvidingLaboratoryEditorInverseIterator = (ServiceProvidingLaboratoryEditorInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryEditorInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for editor tag ");
		}
		return SKIP_BODY;
	}
}

