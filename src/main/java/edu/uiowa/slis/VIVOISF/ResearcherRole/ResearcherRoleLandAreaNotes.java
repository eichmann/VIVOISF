package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleLandAreaNotesIterator theResearcherRole = (ResearcherRoleLandAreaNotesIterator)findAncestorWithClass(this, ResearcherRoleLandAreaNotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

