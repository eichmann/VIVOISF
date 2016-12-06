package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePopulationUnitIterator theResearcherRole = (ResearcherRolePopulationUnitIterator)findAncestorWithClass(this, ResearcherRolePopulationUnitIterator.class);
			pageContext.getOut().print(theResearcherRole.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

