package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicHasCollaboratorInverseIterator theNonFacultyAcademicHasCollaboratorInverseIterator = (NonFacultyAcademicHasCollaboratorInverseIterator)findAncestorWithClass(this, NonFacultyAcademicHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

