package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCountryAreaTotalIterator theResearcherRole = (ResearcherRoleCountryAreaTotalIterator)findAncestorWithClass(this, ResearcherRoleCountryAreaTotalIterator.class);
			pageContext.getOut().print(theResearcherRole.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

