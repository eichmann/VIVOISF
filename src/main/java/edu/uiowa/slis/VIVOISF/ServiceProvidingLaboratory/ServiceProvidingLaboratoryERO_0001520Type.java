package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryERO_0001520Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryERO_0001520Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryERO_0001520Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryERO_0001520Iterator theServiceProvidingLaboratoryERO_0001520Iterator = (ServiceProvidingLaboratoryERO_0001520Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryERO_0001520Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryERO_0001520Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

