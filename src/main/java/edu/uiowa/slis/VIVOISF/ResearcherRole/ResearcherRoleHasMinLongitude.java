package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasMinLongitudeIterator theResearcherRole = (ResearcherRoleHasMinLongitudeIterator)findAncestorWithClass(this, ResearcherRoleHasMinLongitudeIterator.class);
			pageContext.getOut().print(theResearcherRole.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

