package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialZHIterator theResearcherRole = (ResearcherRoleNameOfficialZHIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialZHIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

