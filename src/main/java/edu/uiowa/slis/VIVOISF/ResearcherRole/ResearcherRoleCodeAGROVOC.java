package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeAGROVOCIterator theResearcherRole = (ResearcherRoleCodeAGROVOCIterator)findAncestorWithClass(this, ResearcherRoleCodeAGROVOCIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

