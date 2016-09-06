package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationHasSuccessorOrganizationIterator theStudentOrganizationHasSuccessorOrganizationIterator = (StudentOrganizationHasSuccessorOrganizationIterator)findAncestorWithClass(this, StudentOrganizationHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theStudentOrganizationHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

