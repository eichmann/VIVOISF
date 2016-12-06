package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityENIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityENIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityENIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

