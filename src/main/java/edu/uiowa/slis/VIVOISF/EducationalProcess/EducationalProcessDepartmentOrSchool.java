package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessDepartmentOrSchool extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessDepartmentOrSchool currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessDepartmentOrSchool.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EducationalProcessDepartmentOrSchoolIterator theEducationalProcess = (EducationalProcessDepartmentOrSchoolIterator)findAncestorWithClass(this, EducationalProcessDepartmentOrSchoolIterator.class);
			pageContext.getOut().print(theEducationalProcess.getDepartmentOrSchool());
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for departmentOrSchool tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for departmentOrSchool tag ");
		}
		return SKIP_BODY;
	}
}

