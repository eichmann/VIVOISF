package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionAgriculturalAreaNotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionAgriculturalAreaNotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

