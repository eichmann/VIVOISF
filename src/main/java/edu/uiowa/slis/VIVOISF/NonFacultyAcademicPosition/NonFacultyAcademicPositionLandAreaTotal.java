package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionLandAreaTotalIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionLandAreaTotalIterator)findAncestorWithClass(this, NonFacultyAcademicPositionLandAreaTotalIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

