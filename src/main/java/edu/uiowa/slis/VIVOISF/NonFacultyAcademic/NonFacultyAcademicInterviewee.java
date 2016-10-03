package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicIntervieweeIterator theNonFacultyAcademicIntervieweeIterator = (NonFacultyAcademicIntervieweeIterator)findAncestorWithClass(this, NonFacultyAcademicIntervieweeIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

