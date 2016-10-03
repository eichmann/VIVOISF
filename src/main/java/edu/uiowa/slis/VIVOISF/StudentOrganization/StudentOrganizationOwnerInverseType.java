package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationOwnerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationOwnerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationOwnerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationOwnerInverseIterator theStudentOrganizationOwnerInverseIterator = (StudentOrganizationOwnerInverseIterator)findAncestorWithClass(this, StudentOrganizationOwnerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationOwnerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for owner tag ");
		}
		return SKIP_BODY;
	}
}

