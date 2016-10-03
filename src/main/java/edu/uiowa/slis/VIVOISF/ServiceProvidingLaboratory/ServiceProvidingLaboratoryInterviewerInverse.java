package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryInterviewerInverseIterator theServiceProvidingLaboratoryInterviewerInverseIterator = (ServiceProvidingLaboratoryInterviewerInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryInterviewerInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

