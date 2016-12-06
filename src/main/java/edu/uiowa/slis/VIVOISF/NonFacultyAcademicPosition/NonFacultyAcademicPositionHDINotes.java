package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHDINotesIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHDINotesIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHDINotesIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

