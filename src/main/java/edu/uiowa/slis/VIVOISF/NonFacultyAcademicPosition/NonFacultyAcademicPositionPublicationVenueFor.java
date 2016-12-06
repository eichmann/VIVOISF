package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicPositionPublicationVenueForIterator theNonFacultyAcademicPositionPublicationVenueForIterator = (NonFacultyAcademicPositionPublicationVenueForIterator)findAncestorWithClass(this, NonFacultyAcademicPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicPositionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademicPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademicPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

