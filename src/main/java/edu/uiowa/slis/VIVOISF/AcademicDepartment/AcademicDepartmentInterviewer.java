package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentInterviewer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentInterviewer currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentInterviewer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentInterviewerIterator theAcademicDepartmentInterviewerIterator = (AcademicDepartmentInterviewerIterator)findAncestorWithClass(this, AcademicDepartmentInterviewerIterator.class);
			pageContext.getOut().print(theAcademicDepartmentInterviewerIterator.getInterviewer());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

