package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasPublicationVenue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasPublicationVenue currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasPublicationVenue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasPublicationVenueIterator theResearcherRoleHasPublicationVenueIterator = (ResearcherRoleHasPublicationVenueIterator)findAncestorWithClass(this, ResearcherRoleHasPublicationVenueIterator.class);
			pageContext.getOut().print(theResearcherRoleHasPublicationVenueIterator.getHasPublicationVenue());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasPublicationVenue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasPublicationVenue tag ");
		}
		return SKIP_BODY;
	}
}

