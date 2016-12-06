package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeUNDPIterator theResearcherRole = (ResearcherRoleCodeUNDPIterator)findAncestorWithClass(this, ResearcherRoleCodeUNDPIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

