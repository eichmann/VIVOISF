package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionLandAreaUnitIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionLandAreaUnitIterator)findAncestorWithClass(this, NonFacultyAcademicPositionLandAreaUnitIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

