package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryRO_0000053Iterator theServiceProvidingLaboratoryRO_0000053Iterator = (ServiceProvidingLaboratoryRO_0000053Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryRO_0000053Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

