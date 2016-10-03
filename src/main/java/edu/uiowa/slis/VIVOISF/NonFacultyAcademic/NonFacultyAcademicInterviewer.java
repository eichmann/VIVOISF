package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicInterviewerIterator theNonFacultyAcademicInterviewerIterator = (NonFacultyAcademicInterviewerIterator)findAncestorWithClass(this, NonFacultyAcademicInterviewerIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

