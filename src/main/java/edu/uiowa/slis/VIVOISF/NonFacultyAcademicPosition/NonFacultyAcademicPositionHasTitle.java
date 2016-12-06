package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasTitleIterator theNonFacultyAcademicPositionHasTitleIterator = (NonFacultyAcademicPositionHasTitleIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasTitleIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}
