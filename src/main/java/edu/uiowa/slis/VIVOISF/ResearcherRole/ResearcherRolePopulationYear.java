package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePopulationYearIterator theResearcherRole = (ResearcherRolePopulationYearIterator)findAncestorWithClass(this, ResearcherRolePopulationYearIterator.class);
			pageContext.getOut().print(theResearcherRole.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

