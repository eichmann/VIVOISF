package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicInterviewerInverseIterator theNonFacultyAcademicInterviewerInverseIterator = (NonFacultyAcademicInterviewerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicInterviewerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

