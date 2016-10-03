package edu.uiowa.slis.VIVOISF.ServiceProvidingLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ServiceProvidingLaboratoryInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ServiceProvidingLaboratoryInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(ServiceProvidingLaboratoryInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ServiceProvidingLaboratoryInterviewerIterator theServiceProvidingLaboratoryInterviewerIterator = (ServiceProvidingLaboratoryInterviewerIterator)findAncestorWithClass(this, ServiceProvidingLaboratoryInterviewerIterator.class);
			pageContext.getOut().print(theServiceProvidingLaboratoryInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing ServiceProvidingLaboratory for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ServiceProvidingLaboratory for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

