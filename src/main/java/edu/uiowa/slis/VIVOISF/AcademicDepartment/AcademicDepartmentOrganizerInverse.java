package edu.uiowa.slis.VIVOISF.AcademicDepartment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDepartmentOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDepartmentOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDepartmentOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AcademicDepartmentOrganizerInverseIterator theAcademicDepartmentOrganizerInverseIterator = (AcademicDepartmentOrganizerInverseIterator)findAncestorWithClass(this, AcademicDepartmentOrganizerInverseIterator.class);
			pageContext.getOut().print(theAcademicDepartmentOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDepartment for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDepartment for organizer tag ");
		}
		return SKIP_BODY;
	}
}

