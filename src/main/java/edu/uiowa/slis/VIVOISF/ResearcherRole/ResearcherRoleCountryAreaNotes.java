package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCountryAreaNotesIterator theResearcherRole = (ResearcherRoleCountryAreaNotesIterator)findAncestorWithClass(this, ResearcherRoleCountryAreaNotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

