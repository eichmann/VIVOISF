package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityITIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityITIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityITIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

