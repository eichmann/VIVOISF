package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationAffiliatedOrganizationInverseIterator theStudentOrganizationAffiliatedOrganizationInverseIterator = (StudentOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, StudentOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

