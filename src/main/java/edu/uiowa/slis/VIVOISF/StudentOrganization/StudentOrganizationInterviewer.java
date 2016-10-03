package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationInterviewerIterator theStudentOrganizationInterviewerIterator = (StudentOrganizationInterviewerIterator)findAncestorWithClass(this, StudentOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theStudentOrganizationInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

