package edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyAdministrativePositionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyAdministrativePositionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyAdministrativePositionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyAdministrativePositionPublicationVenueForIterator theFacultyAdministrativePositionPublicationVenueForIterator = (FacultyAdministrativePositionPublicationVenueForIterator)findAncestorWithClass(this, FacultyAdministrativePositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theFacultyAdministrativePositionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyAdministrativePosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyAdministrativePosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

