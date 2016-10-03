package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationOrganizerInverseIterator theOrganizationOrganizerInverseIterator = (OrganizationOrganizerInverseIterator)findAncestorWithClass(this, OrganizationOrganizerInverseIterator.class);
			pageContext.getOut().print(theOrganizationOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for organizer tag ");
		}
		return SKIP_BODY;
	}
}

