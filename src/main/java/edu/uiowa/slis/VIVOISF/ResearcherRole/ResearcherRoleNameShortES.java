package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortESIterator theResearcherRole = (ResearcherRoleNameShortESIterator)findAncestorWithClass(this, ResearcherRoleNameShortESIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

