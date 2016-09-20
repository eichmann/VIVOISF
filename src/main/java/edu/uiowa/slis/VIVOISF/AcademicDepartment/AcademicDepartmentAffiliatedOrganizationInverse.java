package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentAffiliatedOrganizationInverseIterator theAcademicDepartmentAffiliatedOrganizationInverseIterator = (AcademicDepartmentAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, AcademicDepartmentAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

