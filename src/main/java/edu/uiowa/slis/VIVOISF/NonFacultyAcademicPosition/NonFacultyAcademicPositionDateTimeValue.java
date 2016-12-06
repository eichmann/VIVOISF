package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionDateTimeValueIterator theNonFacultyAcademicPositionDateTimeValueIterator = (NonFacultyAcademicPositionDateTimeValueIterator)findAncestorWithClass(this, NonFacultyAcademicPositionDateTimeValueIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

