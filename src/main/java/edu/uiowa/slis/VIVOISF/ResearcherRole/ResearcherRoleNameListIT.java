package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListITIterator theResearcherRole = (ResearcherRoleNameListITIterator)findAncestorWithClass(this, ResearcherRoleNameListITIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

