package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasMinLongitudeIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHasMinLongitudeIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

