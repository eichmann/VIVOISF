package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHDINotesIterator theResearcherRole = (ResearcherRoleHDINotesIterator)findAncestorWithClass(this, ResearcherRoleHDINotesIterator.class);
			pageContext.getOut().print(theResearcherRole.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

