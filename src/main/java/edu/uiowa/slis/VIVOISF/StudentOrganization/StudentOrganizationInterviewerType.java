package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationInterviewerIterator theStudentOrganizationInterviewerIterator = (StudentOrganizationInterviewerIterator)findAncestorWithClass(this, StudentOrganizationInterviewerIterator.class);
			pageContext.getOut().print(theStudentOrganizationInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

