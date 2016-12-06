package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionGDPYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionGDPYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionGDPYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

