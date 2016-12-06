package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListESIterator theResearcherRole = (ResearcherRoleNameListESIterator)findAncestorWithClass(this, ResearcherRoleNameListESIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

