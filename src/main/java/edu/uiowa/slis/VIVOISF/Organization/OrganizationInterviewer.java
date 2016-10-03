package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationInterviewerIterator theOrganizationInterviewerIterator = (OrganizationInterviewerIterator)findAncestorWithClass(this, OrganizationInterviewerIterator.class);
			pageContext.getOut().print(theOrganizationInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

