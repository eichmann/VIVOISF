package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingHasPublicationVenueIterator theThingHasPublicationVenueIterator = (ThingHasPublicationVenueIterator)findAncestorWithClass(this, ThingHasPublicationVenueIterator.class);
			pageContext.getOut().print(theThingHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

