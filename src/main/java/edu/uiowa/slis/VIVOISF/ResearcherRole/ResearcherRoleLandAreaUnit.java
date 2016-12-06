package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleLandAreaUnitIterator theResearcherRole = (ResearcherRoleLandAreaUnitIterator)findAncestorWithClass(this, ResearcherRoleLandAreaUnitIterator.class);
			pageContext.getOut().print(theResearcherRole.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

