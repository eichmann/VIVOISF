package edu.uiowa.slis.VIVOISF.NonAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicPositionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicPositionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicPositionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicPositionPublicationVenueForIterator theNonAcademicPositionPublicationVenueForIterator = (NonAcademicPositionPublicationVenueForIterator)findAncestorWithClass(this, NonAcademicPositionPublicationVenueForIterator.class);
			pageContext.getOut().print(theNonAcademicPositionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademicPosition for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademicPosition for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

