package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasPublicationVenueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasPublicationVenueType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasPublicationVenueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasPublicationVenueIterator theOrganizationHasPublicationVenueIterator = (OrganizationHasPublicationVenueIterator)findAncestorWithClass(this, OrganizationHasPublicationVenueIterator.class);
			pageContext.getOut().print(theOrganizationHasPublicationVenueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

