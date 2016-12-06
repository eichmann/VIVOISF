package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityARIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityARIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityARIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

