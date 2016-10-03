package edu.uiowa.slis.VIVOISF.StudentOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudentOrganizationOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StudentOrganizationOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(StudentOrganizationOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudentOrganizationOrganizerInverseIterator theStudentOrganizationOrganizerInverseIterator = (StudentOrganizationOrganizerInverseIterator)findAncestorWithClass(this, StudentOrganizationOrganizerInverseIterator.class);
			pageContext.getOut().print(theStudentOrganizationOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing StudentOrganization for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudentOrganization for organizer tag ");
		}
		return SKIP_BODY;
	}
}

