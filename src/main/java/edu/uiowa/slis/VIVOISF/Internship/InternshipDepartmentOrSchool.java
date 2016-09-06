package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipDepartmentOrSchool extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipDepartmentOrSchool currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipDepartmentOrSchool.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InternshipDepartmentOrSchoolIterator theInternship = (InternshipDepartmentOrSchoolIterator)findAncestorWithClass(this, InternshipDepartmentOrSchoolIterator.class);
			pageContext.getOut().print(theInternship.getDepartmentOrSchool());
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for departmentOrSchool tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for departmentOrSchool tag ");
		}
		return SKIP_BODY;
	}
}

