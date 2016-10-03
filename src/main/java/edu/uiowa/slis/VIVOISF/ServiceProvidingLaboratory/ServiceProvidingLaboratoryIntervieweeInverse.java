package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryIntervieweeInverseIterator theServiceProvidingLaboratoryIntervieweeInverseIterator = (ServiceProvidingLaboratoryIntervieweeInverseIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryIntervieweeInverseIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
