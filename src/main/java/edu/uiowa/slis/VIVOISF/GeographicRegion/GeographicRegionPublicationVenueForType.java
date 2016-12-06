package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPublicationVenueForIterator theGeographicRegionPublicationVenueForIterator = (GeographicRegionPublicationVenueForIterator)findAncestorWithClass(this, GeographicRegionPublicationVenueForIterator.class);
			pageContext.getOut().print(theGeographicRegionPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

