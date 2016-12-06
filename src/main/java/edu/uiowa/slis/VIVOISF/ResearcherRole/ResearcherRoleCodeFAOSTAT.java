package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeFAOSTATIterator theResearcherRole = (ResearcherRoleCodeFAOSTATIterator)findAncestorWithClass(this, ResearcherRoleCodeFAOSTATIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

