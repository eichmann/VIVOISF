package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialITIterator theResearcherRole = (ResearcherRoleNameOfficialITIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialITIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

