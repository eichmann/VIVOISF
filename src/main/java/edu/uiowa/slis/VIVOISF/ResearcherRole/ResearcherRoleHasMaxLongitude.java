package edu.uiowa.slis.VIVOISF.ResearcherRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearcherRoleHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearcherRoleHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearcherRoleHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearcherRoleHasMaxLongitudeIterator theResearcherRole = (ResearcherRoleHasMaxLongitudeIterator)findAncestorWithClass(this, ResearcherRoleHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theResearcherRole.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherRole for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearcherRole for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

