package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentHasSuccessorOrganizationIterator theAcademicDepartmentHasSuccessorOrganizationIterator = (AcademicDepartmentHasSuccessorOrganizationIterator)findAncestorWithClass(this, AcademicDepartmentHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theAcademicDepartmentHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

