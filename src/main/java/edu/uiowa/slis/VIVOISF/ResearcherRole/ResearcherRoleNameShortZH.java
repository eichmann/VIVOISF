package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortZHIterator theResearcherRole = (ResearcherRoleNameShortZHIterator)findAncestorWithClass(this, ResearcherRoleNameShortZHIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

