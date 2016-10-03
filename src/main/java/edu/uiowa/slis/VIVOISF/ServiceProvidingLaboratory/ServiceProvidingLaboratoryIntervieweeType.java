package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryIntervieweeIterator theServiceProvidingLaboratoryIntervieweeIterator = (ServiceProvidingLaboratoryIntervieweeIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryIntervieweeIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

