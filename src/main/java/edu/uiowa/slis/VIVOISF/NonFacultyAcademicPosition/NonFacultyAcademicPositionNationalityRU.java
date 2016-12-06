package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionNationalityRUIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionNationalityRUIterator)findAncestorWithClass(this, NonFacultyAcademicPositionNationalityRUIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

