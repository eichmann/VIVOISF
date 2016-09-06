package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationSubcontractsGrantIterator theStudentOrganizationSubcontractsGrantIterator = (StudentOrganizationSubcontractsGrantIterator)findAncestorWithClass(this, StudentOrganizationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theStudentOrganizationSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

