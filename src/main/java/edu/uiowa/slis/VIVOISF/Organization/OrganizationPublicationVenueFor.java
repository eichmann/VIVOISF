package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPublicationVenueFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPublicationVenueFor currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPublicationVenueFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPublicationVenueForIterator theOrganizationPublicationVenueForIterator = (OrganizationPublicationVenueForIterator)findAncestorWithClass(this, OrganizationPublicationVenueForIterator.class);
			pageContext.getOut().print(theOrganizationPublicationVenueForIterator.getPublicationVenueFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

