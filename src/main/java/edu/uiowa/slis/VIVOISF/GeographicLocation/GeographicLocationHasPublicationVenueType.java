package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationHasPublicationVenueIterator theGeographicLocationHasPublicationVenueIterator = (GeographicLocationHasPublicationVenueIterator)findAncestorWithClass(this, GeographicLocationHasPublicationVenueIterator.class);
			pageContext.getOut().print(theGeographicLocationHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

