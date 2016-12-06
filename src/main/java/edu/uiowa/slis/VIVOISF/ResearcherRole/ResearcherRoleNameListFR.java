package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListFRIterator theResearcherRole = (ResearcherRoleNameListFRIterator)findAncestorWithClass(this, ResearcherRoleNameListFRIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

