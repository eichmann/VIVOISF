package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasMaxLatitudeIterator theNonFacultyAcademicPosition = (NonFacultyAcademicPositionHasMaxLatitudeIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPosition.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

