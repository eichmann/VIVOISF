package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryERO_0000037Iterator theServiceProvidingLaboratoryERO_0000037Iterator = (ServiceProvidingLaboratoryERO_0000037Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryERO_0000037Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

