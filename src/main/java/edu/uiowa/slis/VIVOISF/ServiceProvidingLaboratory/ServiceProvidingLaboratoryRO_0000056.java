package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryRO_0000056Iterator theServiceProvidingLaboratoryRO_0000056Iterator = (ServiceProvidingLaboratoryRO_0000056Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryRO_0000056Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

