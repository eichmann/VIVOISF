package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionPopulationYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionPopulationYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionPopulationYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

