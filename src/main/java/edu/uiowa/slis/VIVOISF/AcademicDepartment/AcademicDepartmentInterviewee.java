package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentIntervieweeIterator theAcademicDepartmentIntervieweeIterator = (AcademicDepartmentIntervieweeIterator)findAncestorWithClass(this, AcademicDepartmentIntervieweeIterator.class);
			pageContext.getOut().print(theAcademicDepartmentIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

