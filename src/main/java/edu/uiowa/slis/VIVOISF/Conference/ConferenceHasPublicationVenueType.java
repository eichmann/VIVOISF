package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasPublicationVenueIterator theConferenceHasPublicationVenueIterator = (ConferenceHasPublicationVenueIterator)findAncestorWithClass(this, ConferenceHasPublicationVenueIterator.class);
			pageContext.getOut().print(theConferenceHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

