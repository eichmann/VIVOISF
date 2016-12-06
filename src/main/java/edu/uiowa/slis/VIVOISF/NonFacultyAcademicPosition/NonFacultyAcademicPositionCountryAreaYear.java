package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCountryAreaYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCountryAreaYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCountryAreaYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

