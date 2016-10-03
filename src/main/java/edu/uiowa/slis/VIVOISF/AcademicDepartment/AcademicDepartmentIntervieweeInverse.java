package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentIntervieweeInverseIterator theAcademicDepartmentIntervieweeInverseIterator = (AcademicDepartmentIntervieweeInverseIterator)findAncestorWithClass(this, AcademicDepartmentIntervieweeInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

