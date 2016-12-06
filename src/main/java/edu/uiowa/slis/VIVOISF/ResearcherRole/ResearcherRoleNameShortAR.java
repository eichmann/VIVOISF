package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameShortARIterator theResearcherRole = (ResearcherRoleNameShortARIterator)findAncestorWithClass(this, ResearcherRoleNameShortARIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

