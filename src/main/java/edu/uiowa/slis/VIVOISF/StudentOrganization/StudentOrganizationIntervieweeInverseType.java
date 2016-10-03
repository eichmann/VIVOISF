package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationIntervieweeInverseIterator theStudentOrganizationIntervieweeInverseIterator = (StudentOrganizationIntervieweeInverseIterator)findAncestorWithClass(this, StudentOrganizationIntervieweeInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

