package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialESIterator theResearcherRole = (ResearcherRoleNameOfficialESIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialESIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

