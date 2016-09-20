package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryERO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryERO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryERO_0000054.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryERO_0000054Iterator theServiceProvidingLaboratory = (ServiceProvidingLaboratoryERO_0000054Iterator)findAncestorWithClass(this, ServiceProvidingLaboratoryERO_0000054Iterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratory.getERO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for ERO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for ERO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

