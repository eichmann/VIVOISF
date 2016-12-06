package edu.uiowa.slis.VIVOISF.GovernmentAgency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GovernmentAgencyPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GovernmentAgencyPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(GovernmentAgencyPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GovernmentAgencyPublicationVenueForIterator theGovernmentAgencyPublicationVenueForIterator = (GovernmentAgencyPublicationVenueForIterator)findAncestorWithClass(this, GovernmentAgencyPublicationVenueForIterator.class);
			pageContext.getOut().print(theGovernmentAgencyPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing GovernmentAgency for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing GovernmentAgency for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

