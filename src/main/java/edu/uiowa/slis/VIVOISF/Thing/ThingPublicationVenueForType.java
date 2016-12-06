package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPublicationVenueForIterator theThingPublicationVenueForIterator = (ThingPublicationVenueForIterator)findAncestorWithClass(this, ThingPublicationVenueForIterator.class);
			pageContext.getOut().print(theThingPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

