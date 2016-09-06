package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentHasCollaboratorIterator theAcademicDepartmentHasCollaboratorIterator = (AcademicDepartmentHasCollaboratorIterator)findAncestorWithClass(this, AcademicDepartmentHasCollaboratorIterator.class);
			pageContext.getOut().print(theAcademicDepartmentHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

