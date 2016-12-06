package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasSubjectAreaIterator theNonFacultyAcademicPositionHasSubjectAreaIterator = (NonFacultyAcademicPositionHasSubjectAreaIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

