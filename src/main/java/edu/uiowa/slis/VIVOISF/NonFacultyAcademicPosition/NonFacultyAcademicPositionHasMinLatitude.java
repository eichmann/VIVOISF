package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasMinLatitudeIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHasMinLatitudeIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

