package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePublicationVenueForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePublicationVenueForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePublicationVenueForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePublicationVenueForIterator theResearcherRolePublicationVenueForIterator = (ResearcherRolePublicationVenueForIterator)findAncestorWithClass(this, ResearcherRolePublicationVenueForIterator.class);
			pageContext.getOut().print(theResearcherRolePublicationVenueForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for publicationVenueFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for publicationVenueFor tag ");
		}
		return SKIP_BODY;
	}
}

