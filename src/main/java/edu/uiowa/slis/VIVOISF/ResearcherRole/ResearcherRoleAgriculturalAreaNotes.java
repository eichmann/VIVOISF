package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleAgriculturalAreaNotesIterator theResearcherRole = (ResearcherRoleAgriculturalAreaNotesIterator)findAncestorWithClass(this, ResearcherRoleAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

