package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHDITotalIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHDITotalIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHDITotalIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

