package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationIntervieweeIterator theStudentOrganizationIntervieweeIterator = (StudentOrganizationIntervieweeIterator)findAncestorWithClass(this, StudentOrganizationIntervieweeIterator.class);
			pageContext.getOut().print(theStudentOrganizationIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

