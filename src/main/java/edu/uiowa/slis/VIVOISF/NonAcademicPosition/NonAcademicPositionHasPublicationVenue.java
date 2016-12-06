package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionHasPublicationVenueIterator theNonAcademicPositionHasPublicationVenueIterator = (NonAcademicPositionHasPublicationVenueIterator)findAncestorWithClass(this, NonAcademicPositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theNonAcademicPositionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

