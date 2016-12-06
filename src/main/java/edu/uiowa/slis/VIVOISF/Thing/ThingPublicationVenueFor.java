package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPublicationVenueForIterator theThingPublicationVenueForIterator = (ThingPublicationVenueForIterator)findAncestorWithClass(this, ThingPublicationVenueForIterator.class);
			pageContext.getOut().print(theThingPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

