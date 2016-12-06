package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionAgriculturalAreaUnitIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionAgriculturalAreaUnitIterator)findAncestorWithClass(this, NonFacultyAcademicPositionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

