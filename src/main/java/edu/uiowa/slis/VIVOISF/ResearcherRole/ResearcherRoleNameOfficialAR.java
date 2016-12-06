package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialARIterator theResearcherRole = (ResearcherRoleNameOfficialARIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialARIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

