package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasPublicationVenueIterator theGeographicRegionHasPublicationVenueIterator = (GeographicRegionHasPublicationVenueIterator)findAncestorWithClass(this, GeographicRegionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theGeographicRegionHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

