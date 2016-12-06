package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionCountryAreaNotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionCountryAreaNotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

