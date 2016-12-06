package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionAgriculturalAreaTotalIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionAgriculturalAreaTotalIterator)findAncestorWithClass(this, NonFacultyAcademicPositionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

