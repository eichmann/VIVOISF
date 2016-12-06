package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionPublicationVenueForIterator theGeographicRegionPublicationVenueForIterator = (GeographicRegionPublicationVenueForIterator)findAncestorWithClass(this, GeographicRegionPublicationVenueForIterator.class);
			pageContext.getOut().print(theGeographicRegionPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

