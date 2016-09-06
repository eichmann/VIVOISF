package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationAssigneeForIterator theStudentOrganizationAssigneeForIterator = (StudentOrganizationAssigneeForIterator)findAncestorWithClass(this, StudentOrganizationAssigneeForIterator.class);
			pageContext.getOut().print(theStudentOrganizationAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

