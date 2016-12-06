package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationLandAreaNotesIterator theOrganization = (OrganizationLandAreaNotesIterator)findAncestorWithClass(this, OrganizationLandAreaNotesIterator.class);
			pageContext.getOut().print(theOrganization.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

