package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRoleContributesToType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRoleContributesToType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRoleContributesToType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRoleContributesToIterator theResearcherRoleRoleContributesToIterator = (ResearcherRoleRoleContributesToIterator)findAncestorWithClass(this, ResearcherRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theResearcherRoleRoleContributesToIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

