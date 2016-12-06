package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionLandAreaNotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionLandAreaNotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionLandAreaNotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

