package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionAgriculturalAreaYearIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionAgriculturalAreaYearIterator)findAncestorWithClass(this, NonFacultyAcademicPositionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

