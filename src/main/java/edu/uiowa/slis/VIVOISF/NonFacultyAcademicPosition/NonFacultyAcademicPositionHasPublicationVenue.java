package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionHasPublicationVenueIterator theNonFacultyAcademicPositionHasPublicationVenueIterator = (NonFacultyAcademicPositionHasPublicationVenueIterator)findAncestorWithClass(this, NonFacultyAcademicPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

