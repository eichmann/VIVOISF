package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationOBI_0000304Inverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationOBI_0000304Inverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationOBI_0000304Inverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationOBI_0000304InverseIterator theStudentOrganizationOBI_0000304InverseIterator = (StudentOrganizationOBI_0000304InverseIterator)findAncestorWithClass(this, StudentOrganizationOBI_0000304InverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationOBI_0000304InverseIterator.getOBI_0000304Inverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for OBI_0000304 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for OBI_0000304 tag ");
		}
		return SKIP_BODY;
	}
}

