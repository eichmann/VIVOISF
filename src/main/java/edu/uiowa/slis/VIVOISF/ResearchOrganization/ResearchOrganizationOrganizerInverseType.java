package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationOrganizerInverseIterator theResearchOrganizationOrganizerInverseIterator = (ResearchOrganizationOrganizerInverseIterator)findAncestorWithClass(this, ResearchOrganizationOrganizerInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for organizer tag ");
		}
		return SKIP_BODY;
	}
}

