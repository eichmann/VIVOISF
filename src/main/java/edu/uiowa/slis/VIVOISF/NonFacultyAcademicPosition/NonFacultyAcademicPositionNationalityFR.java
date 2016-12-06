package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityFRIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityFRIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityFRIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

