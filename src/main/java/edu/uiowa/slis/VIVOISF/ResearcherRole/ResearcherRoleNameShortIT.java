package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortITIterator theResearcherRole = (ResearcherRoleNameShortITIterator)findAncestorWithClass(this, ResearcherRoleNameShortITIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

