package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionRelatedByIterator theNonFacultyAcademicPositionRelatedByIterator = (NonFacultyAcademicPositionRelatedByIterator)findAncestorWithClass(this, NonFacultyAcademicPositionRelatedByIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

