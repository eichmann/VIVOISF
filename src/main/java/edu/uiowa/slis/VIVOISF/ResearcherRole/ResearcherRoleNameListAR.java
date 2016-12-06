package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleNameListARIterator theResearcherRole = (ResearcherRoleNameListARIterator)findAncestorWithClass(this, ResearcherRoleNameListARIterator.class);
			pageContext.getOut().print(theResearcherRole.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

