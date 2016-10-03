package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationInterviewerInverseIterator theStudentOrganizationInterviewerInverseIterator = (StudentOrganizationInterviewerInverseIterator)findAncestorWithClass(this, StudentOrganizationInterviewerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

