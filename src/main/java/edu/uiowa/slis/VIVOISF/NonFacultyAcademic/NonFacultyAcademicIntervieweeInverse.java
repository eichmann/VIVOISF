package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicIntervieweeInverseIterator theNonFacultyAcademicIntervieweeInverseIterator = (NonFacultyAcademicIntervieweeInverseIterator)findAncestorWithClass(this, NonFacultyAcademicIntervieweeInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

