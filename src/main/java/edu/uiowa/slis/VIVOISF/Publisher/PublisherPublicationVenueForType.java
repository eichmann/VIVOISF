package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherPublicationVenueForIterator thePublisherPublicationVenueForIterator = (PublisherPublicationVenueForIterator)findAncestorWithClass(this, PublisherPublicationVenueForIterator.class);
			pageContext.getOut().print(thePublisherPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

