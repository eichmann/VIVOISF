package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentHasPredecessorOrganizationIterator theAcademicDepartmentHasPredecessorOrganizationIterator = (AcademicDepartmentHasPredecessorOrganizationIterator)findAncestorWithClass(this, AcademicDepartmentHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theAcademicDepartmentHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

