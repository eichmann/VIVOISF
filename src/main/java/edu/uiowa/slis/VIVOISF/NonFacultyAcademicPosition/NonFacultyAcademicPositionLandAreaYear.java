package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionLandAreaYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionLandAreaYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionLandAreaYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

