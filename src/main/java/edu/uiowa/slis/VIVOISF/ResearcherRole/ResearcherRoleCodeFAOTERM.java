package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeFAOTERMIterator theResearcherRole = (ResearcherRoleCodeFAOTERMIterator)findAncestorWithClass(this, ResearcherRoleCodeFAOTERMIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

