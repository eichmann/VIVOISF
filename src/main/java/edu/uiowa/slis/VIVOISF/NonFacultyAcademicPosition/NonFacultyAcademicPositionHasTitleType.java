package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasTitleIterator theNonFacultyAcademicPositionHasTitleIterator = (NonFacultyAcademicPositionHasTitleIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasTitleIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

