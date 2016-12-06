package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRolePopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRolePopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRolePopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRolePopulationTotalIterator theResearcherRole = (ResearcherRolePopulationTotalIterator)findAncestorWithClass(this, ResearcherRolePopulationTotalIterator.class);
			pageContext.getOut().print(theResearcherRole.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

