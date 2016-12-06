package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortFRIterator theResearcherRole = (ResearcherRoleNameShortFRIterator)findAncestorWithClass(this, ResearcherRoleNameShortFRIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

