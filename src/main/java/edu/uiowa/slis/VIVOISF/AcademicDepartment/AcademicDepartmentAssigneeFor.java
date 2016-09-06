package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentAssigneeFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentAssigneeFor currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentAssigneeFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentAssigneeForIterator theAcademicDepartmentAssigneeForIterator = (AcademicDepartmentAssigneeForIterator)findAncestorWithClass(this, AcademicDepartmentAssigneeForIterator.class);
			pageContext.getOut().print(theAcademicDepartmentAssigneeForIterator.getAssigneeFor());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

