package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleUrlIterator theResearcherRole = (ResearcherRoleUrlIterator)findAncestorWithClass(this, ResearcherRoleUrlIterator.class);
			pageContext.getOut().print(theResearcherRole.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for url tag ");
		}
		return SKIP_BODY;
	}
}

