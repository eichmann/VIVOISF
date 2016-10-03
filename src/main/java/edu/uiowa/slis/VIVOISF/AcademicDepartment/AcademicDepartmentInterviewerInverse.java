package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentInterviewerInverseIterator theAcademicDepartmentInterviewerInverseIterator = (AcademicDepartmentInterviewerInverseIterator)findAncestorWithClass(this, AcademicDepartmentInterviewerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

