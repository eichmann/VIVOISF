package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationGDPNotesIterator theOrganization = (OrganizationGDPNotesIterator)findAncestorWithClass(this, OrganizationGDPNotesIterator.class);
			pageContext.getOut().print(theOrganization.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

