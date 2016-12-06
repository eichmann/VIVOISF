package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCountryAreaUnitIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCountryAreaUnitIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

