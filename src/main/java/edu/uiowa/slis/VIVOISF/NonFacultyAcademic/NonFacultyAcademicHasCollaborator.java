package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicHasCollaboratorIterator theNonFacultyAcademicHasCollaboratorIterator = (NonFacultyAcademicHasCollaboratorIterator)findAncestorWithClass(this, NonFacultyAcademicHasCollaboratorIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

