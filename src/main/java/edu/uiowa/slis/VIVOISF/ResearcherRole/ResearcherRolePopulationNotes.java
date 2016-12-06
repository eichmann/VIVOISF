package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePopulationNotesIterator theResearcherRole = (ResearcherRolePopulationNotesIterator)findAncestorWithClass(this, ResearcherRolePopulationNotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

