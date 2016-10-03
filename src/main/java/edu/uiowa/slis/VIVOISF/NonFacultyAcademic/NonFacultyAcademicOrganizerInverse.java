package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicOrganizerInverseIterator theNonFacultyAcademicOrganizerInverseIterator = (NonFacultyAcademicOrganizerInverseIterator)findAncestorWithClass(this, NonFacultyAcademicOrganizerInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for organizer tag ");
		}
		return SKIP_BODY;
	}
}

