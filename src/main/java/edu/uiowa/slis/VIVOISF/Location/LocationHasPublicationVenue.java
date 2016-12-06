package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationHasPublicationVenueIterator theLocationHasPublicationVenueIterator = (LocationHasPublicationVenueIterator)findAncestorWithClass(this, LocationHasPublicationVenueIterator.class);
			pageContext.getOut().print(theLocationHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

