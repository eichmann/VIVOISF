package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryERO_0000031 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryERO_0000031 currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryERO_0000031.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryERO_0000031Iterator theServiceProvidingLaboratoryERO_0000031Iterator = (ServiceProvidingLaboratoryERO_0000031Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryERO_0000031Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryERO_0000031Iterator.getERO_0000031());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

