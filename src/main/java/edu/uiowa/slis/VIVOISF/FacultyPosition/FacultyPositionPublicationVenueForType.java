package edu.uiowa.slis.VIVOISF.FacultyPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyPositionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyPositionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyPositionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyPositionPublicationVenueForIterator theFacultyPositionPublicationVenueForIterator = (FacultyPositionPublicationVenueForIterator)findAncestorWithClass(this, FacultyPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theFacultyPositionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

