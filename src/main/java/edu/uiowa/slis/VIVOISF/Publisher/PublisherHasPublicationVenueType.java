package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherHasPublicationVenueIterator thePublisherHasPublicationVenueIterator = (PublisherHasPublicationVenueIterator)findAncestorWithClass(this, PublisherHasPublicationVenueIterator.class);
			pageContext.getOut().print(thePublisherHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

