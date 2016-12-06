package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionPopulationUnitIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionPopulationUnitIterator)findAncestorWithClass(this, NonFacultyAcademicPositionPopulationUnitIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

