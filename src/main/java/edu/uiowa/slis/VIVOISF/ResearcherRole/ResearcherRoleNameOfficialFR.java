package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialFRIterator theResearcherRole = (ResearcherRoleNameOfficialFRIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialFRIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

