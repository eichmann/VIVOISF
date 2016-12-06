package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleGDPNotesIterator theResearcherRole = (ResearcherRoleGDPNotesIterator)findAncestorWithClass(this, ResearcherRoleGDPNotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

