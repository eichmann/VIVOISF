package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentAffiliatedOrganizationIterator theAcademicDepartmentAffiliatedOrganizationIterator = (AcademicDepartmentAffiliatedOrganizationIterator)findAncestorWithClass(this, AcademicDepartmentAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theAcademicDepartmentAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

