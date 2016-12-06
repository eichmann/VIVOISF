package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionGeographicFocusIterator theNonFacultyAcademicPositionGeographicFocusIterator = (NonFacultyAcademicPositionGeographicFocusIterator)findAncestorWithClass(this, NonFacultyAcademicPositionGeographicFocusIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

