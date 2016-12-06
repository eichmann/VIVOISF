package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasURLIterator theResearcherRoleHasURLIterator = (ResearcherRoleHasURLIterator)findAncestorWithClass(this, ResearcherRoleHasURLIterator.class);
			pageContext.getOut().print(theResearcherRoleHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

