package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleAgriculturalAreaTotalIterator theResearcherRole = (ResearcherRoleAgriculturalAreaTotalIterator)findAncestorWithClass(this, ResearcherRoleAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theResearcherRole.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

