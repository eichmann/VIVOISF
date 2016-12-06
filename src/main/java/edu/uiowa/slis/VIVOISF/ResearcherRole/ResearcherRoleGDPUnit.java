package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleGDPUnitIterator theResearcherRole = (ResearcherRoleGDPUnitIterator)findAncestorWithClass(this, ResearcherRoleGDPUnitIterator.class);
			pageContext.getOut().print(theResearcherRole.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

