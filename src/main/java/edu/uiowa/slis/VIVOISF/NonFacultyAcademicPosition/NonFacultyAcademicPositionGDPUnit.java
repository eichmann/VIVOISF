package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionGDPUnitIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionGDPUnitIterator)findAncestorWithClass(this, NonFacultyAcademicPositionGDPUnitIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

