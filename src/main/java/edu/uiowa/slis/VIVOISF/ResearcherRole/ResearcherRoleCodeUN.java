package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeUNIterator theResearcherRole = (ResearcherRoleCodeUNIterator)findAncestorWithClass(this, ResearcherRoleCodeUNIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

