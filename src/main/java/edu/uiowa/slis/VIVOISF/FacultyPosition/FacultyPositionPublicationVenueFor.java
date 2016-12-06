package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPublicationVenueForIterator theFacultyPositionPublicationVenueForIterator = (FacultyPositionPublicationVenueForIterator)findAncestorWithClass(this, FacultyPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theFacultyPositionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

