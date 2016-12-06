package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionHasPublicationVenueIterator theGeographicRegionHasPublicationVenueIterator = (GeographicRegionHasPublicationVenueIterator)findAncestorWithClass(this, GeographicRegionHasPublicationVenueIterator.class);
			pageContext.getOut().print(theGeographicRegionHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

