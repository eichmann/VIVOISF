package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialENIterator theResearcherRole = (ResearcherRoleNameOfficialENIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialENIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

