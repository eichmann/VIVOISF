package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePublicationVenueForIterator theConferencePublicationVenueForIterator = (ConferencePublicationVenueForIterator)findAncestorWithClass(this, ConferencePublicationVenueForIterator.class);
			pageContext.getOut().print(theConferencePublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

