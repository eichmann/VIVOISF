package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleCodeDBPediaIDIterator theResearcherRole = (ResearcherRoleCodeDBPediaIDIterator)findAncestorWithClass(this, ResearcherRoleCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theResearcherRole.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

