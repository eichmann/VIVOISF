package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionDateTimeValueIterator theNonFacultyAcademicPositionDateTimeValueIterator = (NonFacultyAcademicPositionDateTimeValueIterator)findAncestorWithClass(this, NonFacultyAcademicPositionDateTimeValueIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

