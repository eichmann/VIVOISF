package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityESIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityESIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityESIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

