package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameOfficialRUIterator theResearcherRole = (ResearcherRoleNameOfficialRUIterator)findAncestorWithClass(this, ResearcherRoleNameOfficialRUIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

