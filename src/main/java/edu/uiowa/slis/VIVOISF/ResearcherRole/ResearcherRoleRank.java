package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleRank currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleRankIterator theResearcherRole = (ResearcherRoleRankIterator)findAncestorWithClass(this, ResearcherRoleRankIterator.class);
			pageContext.getOut().print(theResearcherRole.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for rank tag ");
		}
		return SKIP_BODY;
	}
}

