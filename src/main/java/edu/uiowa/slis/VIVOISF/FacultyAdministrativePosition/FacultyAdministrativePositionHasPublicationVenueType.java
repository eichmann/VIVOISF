package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionHasPublicationVenueIterator theFacultyAdministrativePositionHasPublicationVenueIterator = (FacultyAdministrativePositionHasPublicationVenueIterator)findAncestorWithClass(this, FacultyAdministrativePositionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

