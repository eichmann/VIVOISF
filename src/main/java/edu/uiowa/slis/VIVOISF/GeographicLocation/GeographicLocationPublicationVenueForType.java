package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPublicationVenueForIterator theGeographicLocationPublicationVenueForIterator = (GeographicLocationPublicationVenueForIterator)findAncestorWithClass(this, GeographicLocationPublicationVenueForIterator.class);
			pageContext.getOut().print(theGeographicLocationPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

