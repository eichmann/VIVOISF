package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHrJobTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHrJobTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHrJobTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHrJobTitleIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHrJobTitleIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHrJobTitleIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHrJobTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hrJobTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hrJobTitle tag ");
		}
		return SKIP_BODY;
	}
}

