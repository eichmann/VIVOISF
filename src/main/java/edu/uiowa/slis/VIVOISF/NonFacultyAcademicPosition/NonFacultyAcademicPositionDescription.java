package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionDescriptionIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionDescriptionIterator)findAncestorWithClass(this, NonFacultyAcademicPositionDescriptionIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for description tag ");
		}
		return SKIP_BODY;
	}
}

