package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCountryAreaUnitIterator theResearcherRole = (ResearcherRoleCountryAreaUnitIterator)findAncestorWithClass(this, ResearcherRoleCountryAreaUnitIterator.class);
			pageContext.getOut().print(theResearcherRole.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

