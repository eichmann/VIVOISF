package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationPublicationVenueForIterator theGeographicLocationPublicationVenueForIterator = (GeographicLocationPublicationVenueForIterator)findAncestorWithClass(this, GeographicLocationPublicationVenueForIterator.class);
			pageContext.getOut().print(theGeographicLocationPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

