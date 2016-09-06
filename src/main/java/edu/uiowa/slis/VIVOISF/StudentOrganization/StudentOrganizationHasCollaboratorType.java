package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationHasCollaboratorIterator theStudentOrganizationHasCollaboratorIterator = (StudentOrganizationHasCollaboratorIterator)findAncestorWithClass(this, StudentOrganizationHasCollaboratorIterator.class);
			pageContext.getOut().print(theStudentOrganizationHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

