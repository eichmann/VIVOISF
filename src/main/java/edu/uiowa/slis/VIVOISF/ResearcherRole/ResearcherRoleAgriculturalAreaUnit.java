package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleAgriculturalAreaUnitIterator theResearcherRole = (ResearcherRoleAgriculturalAreaUnitIterator)findAncestorWithClass(this, ResearcherRoleAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theResearcherRole.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

