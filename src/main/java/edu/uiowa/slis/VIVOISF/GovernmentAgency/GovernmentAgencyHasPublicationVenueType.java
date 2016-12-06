package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyHasPublicationVenueIterator theGovernmentAgencyHasPublicationVenueIterator = (GovernmentAgencyHasPublicationVenueIterator)findAncestorWithClass(this, GovernmentAgencyHasPublicationVenueIterator.class);
			pageContext.getOut().print(theGovernmentAgencyHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

