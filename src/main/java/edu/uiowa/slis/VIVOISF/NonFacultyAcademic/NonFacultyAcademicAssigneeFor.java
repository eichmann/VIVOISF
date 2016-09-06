package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicAssigneeForIterator theNonFacultyAcademicAssigneeForIterator = (NonFacultyAcademicAssigneeForIterator)findAncestorWithClass(this, NonFacultyAcademicAssigneeForIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

