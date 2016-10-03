package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationIntervieweeInverseIterator theStudentOrganizationIntervieweeInverseIterator = (StudentOrganizationIntervieweeInverseIterator)findAncestorWithClass(this, StudentOrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

