package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionGDPNotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionGDPNotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionGDPNotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

