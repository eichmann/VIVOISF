package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHDIYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHDIYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHDIYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

