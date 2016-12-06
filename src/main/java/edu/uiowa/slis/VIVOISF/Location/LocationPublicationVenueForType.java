package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LocationPublicationVenueForIterator theLocationPublicationVenueForIterator = (LocationPublicationVenueForIterator)findAncestorWithClass(this, LocationPublicationVenueForIterator.class);
			pageContext.getOut().print(theLocationPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

