package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPublicationVenueForIterator theOrganizationPublicationVenueForIterator = (OrganizationPublicationVenueForIterator)findAncestorWithClass(this, OrganizationPublicationVenueForIterator.class);
			pageContext.getOut().print(theOrganizationPublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

